/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.discoveryserver.handlers;

import org.odpi.openmetadata.discoveryserver.auditlog.DiscoveryServerAuditCode;
import org.odpi.openmetadata.frameworks.discovery.DiscoveryContext;
import org.odpi.openmetadata.frameworks.discovery.DiscoveryReport;
import org.odpi.openmetadata.frameworks.discovery.DiscoveryService;
import org.odpi.openmetadata.frameworks.discovery.properties.DiscoveryEngineProperties;
import org.odpi.openmetadata.frameworks.discovery.properties.DiscoveryRequestStatus;
import org.odpi.openmetadata.repositoryservices.auditlog.OMRSAuditLog;

import java.util.Date;

/**
 * DiscoveryServiceHandler provides the thread to run a discovery service.
 */
public class DiscoveryServiceHandler implements Runnable
{
    private DiscoveryEngineProperties discoveryEngineProperties;
    private String                    assetDiscoveryType;
    private String                    discoveryServiceName;
    private DiscoveryService          discoveryService;
    private DiscoveryContext          discoveryContext;
    private OMRSAuditLog              auditLog;


    /**
     * Constructor sets up the key parameters for running the discovery service.
     * This call is made on the REST call's thread so the properties are just cached.
     * The action happens in the run() method.
     *
     * @param discoveryEngineProperties properties of the discovery engine - used for message logging
     * @param assetDiscoveryType type of asset to analyse - used for message logging
     * @param discoveryServiceName name of this discovery service - used for message logging
     * @param discoveryService connector that does the work
     * @param discoveryContext context for the connector
     * @param auditLog destination for log messages
     */
     DiscoveryServiceHandler(DiscoveryEngineProperties discoveryEngineProperties,
                             String                    assetDiscoveryType,
                             String                    discoveryServiceName,
                             DiscoveryService          discoveryService,
                             DiscoveryContext          discoveryContext,
                             OMRSAuditLog              auditLog)
    {
        this.discoveryEngineProperties = discoveryEngineProperties;
        this.assetDiscoveryType        = assetDiscoveryType;
        this.discoveryServiceName      = discoveryServiceName;
        this.discoveryService          = discoveryService;
        this.discoveryContext          = discoveryContext;
        this.auditLog                  = auditLog;
    }


    /**
     * This is the method that provides the behaviour of the thread.
     */
    @Override
    public void run()
    {
        DiscoveryServerAuditCode auditCode;
        Date                     startTime;
        Date                     endTime;

        final String actionDescription = "Analyse an Asset";

        String discoveryReportGUID = null;

        try
        {
            DiscoveryReport discoveryReport = discoveryContext.getAnnotationStore().getDiscoveryReport();

            discoveryReportGUID = discoveryReport.getDiscoveryReportGUID();

            auditCode = DiscoveryServerAuditCode.DISCOVERY_SERVICE_STARTING;
            auditLog.logRecord(actionDescription,
                               auditCode.getLogMessageId(),
                               auditCode.getSeverity(),
                               auditCode.getFormattedLogMessage(discoveryServiceName,
                                                                discoveryContext.getAssetGUID(),
                                                                assetDiscoveryType,
                                                                discoveryEngineProperties.getQualifiedName(),
                                                                discoveryEngineProperties.getGUID(),
                                                                discoveryReport.getDiscoveryReportGUID()),
                               null,
                               auditCode.getSystemAction(),
                               auditCode.getUserAction());


            discoveryReport.setDiscoveryRequestStatus(DiscoveryRequestStatus.IN_PROGRESS);

            discoveryService.setDiscoveryContext(discoveryContext);
            discoveryService.setDiscoveryServiceName(discoveryServiceName);

            startTime = new Date();
            discoveryService.start();
            endTime = new Date();

            auditCode = DiscoveryServerAuditCode.DISCOVERY_SERVICE_COMPLETE;
            auditLog.logRecord(actionDescription,
                               auditCode.getLogMessageId(),
                               auditCode.getSeverity(),
                               auditCode.getFormattedLogMessage(discoveryServiceName,
                                                                discoveryContext.getAssetGUID(),
                                                                assetDiscoveryType,
                                                                Long.toString(endTime.getTime() - startTime.getTime()),
                                                                discoveryReport.getDiscoveryReportGUID()),
                               null,
                               auditCode.getSystemAction(),
                               auditCode.getUserAction());

            discoveryReport.setDiscoveryRequestStatus(DiscoveryRequestStatus.COMPLETED);
            discoveryService.disconnect();
        }
        catch (Throwable  error)
        {
            auditCode = DiscoveryServerAuditCode.DISCOVERY_SERVICE_FAILED;
            auditLog.logRecord(actionDescription,
                               auditCode.getLogMessageId(),
                               auditCode.getSeverity(),
                               auditCode.getFormattedLogMessage(discoveryServiceName,
                                                                error.getClass().getName(),
                                                                discoveryReportGUID,
                                                                discoveryContext.getAssetGUID(),
                                                                assetDiscoveryType,
                                                                discoveryEngineProperties.getQualifiedName(),
                                                                discoveryEngineProperties.getGUID(),
                                                                error.getMessage()),
                               error.toString(),
                               auditCode.getSystemAction(),
                               auditCode.getUserAction());

            try
            {
                DiscoveryReport discoveryReport = discoveryContext.getAnnotationStore().getDiscoveryReport();
                discoveryReport.setDiscoveryRequestStatus(DiscoveryRequestStatus.FAILED);
            }
            catch (Throwable statusError)
            {
                auditCode = DiscoveryServerAuditCode.EXC_ON_ERROR_STATUS_UPDATE;
                auditLog.logException(actionDescription,
                                      auditCode.getLogMessageId(),
                                      auditCode.getSeverity(),
                                      auditCode.getFormattedLogMessage(discoveryEngineProperties.getDisplayName(),
                                                                       discoveryServiceName,
                                                                       statusError.getClass().getName(),
                                                                       statusError.getMessage()),
                                      statusError.toString(),
                                      auditCode.getSystemAction(),
                                      auditCode.getUserAction(),
                                      statusError);
            }
        }
    }
}
