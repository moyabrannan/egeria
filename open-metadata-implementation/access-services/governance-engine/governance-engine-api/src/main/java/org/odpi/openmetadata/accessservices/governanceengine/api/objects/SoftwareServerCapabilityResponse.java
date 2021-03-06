/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.governanceengine.api.objects;

import java.io.Serializable;

public class SoftwareServerCapabilityResponse extends GovernanceEngineOMASAPIResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private SoftwareServerCapability serverCapability;

    public SoftwareServerCapability getServerCapability() {
        return serverCapability;
    }

    public void setServerCapability(SoftwareServerCapability serverCapability) {
        this.serverCapability = serverCapability;
    }
}
