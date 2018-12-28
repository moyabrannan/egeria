/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.generated.v115;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.odpi.openmetadata.adapters.repositoryservices.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the 'credential' asset type in IGC, displayed as 'Credential' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Credential extends Reference {

    public static String getIgcTypeId() { return "credential"; }
    public static String getIgcTypeDisplayName() { return "Credential"; }

    /**
     * The 'password' property, displayed as 'Password' in the IGC UI.
     */
    protected String password;

    /**
     * The 'username' property, displayed as 'Username' in the IGC UI.
     */
    protected String username;

    /**
     * The 'for_application_install' property, displayed as 'For Application Install' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link ApplicationInstall} object.
     */
    protected Reference for_application_install;

    /**
     * The 'used_by_user_credentials' property, displayed as 'Used By User Credentials' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Credentials} object.
     */
    protected Reference used_by_user_credentials;

    /**
     * The 'of_user_credentials' property, displayed as 'Of User Credentials' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Credentials} object.
     */
    protected Reference of_user_credentials;

    /**
     * The 'default_for_application_install' property, displayed as 'Default For Application Install' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link ApplicationInstall} object.
     */
    protected Reference default_for_application_install;

    /**
     * The 'created_by' property, displayed as 'Created By' in the IGC UI.
     */
    protected String created_by;

    /**
     * The 'created_on' property, displayed as 'Created On' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The 'modified_by' property, displayed as 'Modified By' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The 'modified_on' property, displayed as 'Modified On' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #password */ @JsonProperty("password")  public String getPassword() { return this.password; }
    /** @see #password */ @JsonProperty("password")  public void setPassword(String password) { this.password = password; }

    /** @see #username */ @JsonProperty("username")  public String getUsername() { return this.username; }
    /** @see #username */ @JsonProperty("username")  public void setUsername(String username) { this.username = username; }

    /** @see #for_application_install */ @JsonProperty("for_application_install")  public Reference getForApplicationInstall() { return this.for_application_install; }
    /** @see #for_application_install */ @JsonProperty("for_application_install")  public void setForApplicationInstall(Reference for_application_install) { this.for_application_install = for_application_install; }

    /** @see #used_by_user_credentials */ @JsonProperty("used_by_user_credentials")  public Reference getUsedByUserCredentials() { return this.used_by_user_credentials; }
    /** @see #used_by_user_credentials */ @JsonProperty("used_by_user_credentials")  public void setUsedByUserCredentials(Reference used_by_user_credentials) { this.used_by_user_credentials = used_by_user_credentials; }

    /** @see #of_user_credentials */ @JsonProperty("of_user_credentials")  public Reference getOfUserCredentials() { return this.of_user_credentials; }
    /** @see #of_user_credentials */ @JsonProperty("of_user_credentials")  public void setOfUserCredentials(Reference of_user_credentials) { this.of_user_credentials = of_user_credentials; }

    /** @see #default_for_application_install */ @JsonProperty("default_for_application_install")  public Reference getDefaultForApplicationInstall() { return this.default_for_application_install; }
    /** @see #default_for_application_install */ @JsonProperty("default_for_application_install")  public void setDefaultForApplicationInstall(Reference default_for_application_install) { this.default_for_application_install = default_for_application_install; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static final Boolean canBeCreated() { return false; }
    public static final Boolean includesModificationDetails() { return true; }
    public static final ArrayList<String> NON_RELATIONAL_PROPERTIES = new ArrayList<String>() {{
        add("password");
        add("username");
        add("created_by");
        add("created_on");
        add("modified_by");
        add("modified_on");
    }};
    public static final ArrayList<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    public static final ArrayList<String> ALL_PROPERTIES = new ArrayList<String>() {{
        add("password");
        add("username");
        add("for_application_install");
        add("used_by_user_credentials");
        add("of_user_credentials");
        add("default_for_application_install");
        add("created_by");
        add("created_on");
        add("modified_by");
        add("modified_on");
    }};
    public static final List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static final List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static final List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static final Boolean isCredential(Object obj) { return (obj.getClass() == Credential.class); }

}
