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
 * POJO for the 'data_file' asset type in IGC, displayed as 'Data File' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DataFile extends Reference {

    public static String getIgcTypeId() { return "data_file"; }
    public static String getIgcTypeDisplayName() { return "Data File"; }

    /**
     * The 'name' property, displayed as 'Name' in the IGC UI.
     */
    protected String name;

    /**
     * The 'short_description' property, displayed as 'Short Description' in the IGC UI.
     */
    protected String short_description;

    /**
     * The 'long_description' property, displayed as 'Long Description' in the IGC UI.
     */
    protected String long_description;

    /**
     * The 'parent_folder_or_host' property, displayed as 'Parent Folder or Host' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList parent_folder_or_host;

    /**
     * The 'parent_folder' property, displayed as 'Parent Folder' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference parent_folder;

    /**
     * The 'host' property, displayed as 'Host' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Host} object.
     */
    protected Reference host;

    /**
     * The 'labels' property, displayed as 'Labels' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Label} objects.
     */
    protected ReferenceList labels;

    /**
     * The 'stewards' property, displayed as 'Stewards' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link AsclSteward} objects.
     */
    protected ReferenceList stewards;

    /**
     * The 'assigned_to_terms' property, displayed as 'Assigned to Terms' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList assigned_to_terms;

    /**
     * The 'implements_rules' property, displayed as 'Implements Rules' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList implements_rules;

    /**
     * The 'governed_by_rules' property, displayed as 'Governed by Rules' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList governed_by_rules;

    /**
     * The 'data_file_records' property, displayed as 'Data File Records' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DataFileRecord} objects.
     */
    protected ReferenceList data_file_records;

    /**
     * The 'implements_data_file_definition' property, displayed as 'Implements Data File Definition' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link DataFileDefinition} object.
     */
    protected Reference implements_data_file_definition;

    /**
     * The 'implements_physical_models' property, displayed as 'Implements Physical Models' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link PhysicalDataModel} objects.
     */
    protected ReferenceList implements_physical_models;

    /**
     * The 'alias_(business_name)' property, displayed as 'Alias (Business Name)' in the IGC UI.
     */
    @JsonProperty("alias_(business_name)") protected String alias__business_name_;

    /**
     * The 'path' property, displayed as 'Path' in the IGC UI.
     */
    protected String path;

    /**
     * The 'store_type' property, displayed as 'Type' in the IGC UI.
     */
    protected String store_type;

    /**
     * The 'imported_from' property, displayed as 'Imported From' in the IGC UI.
     */
    protected String imported_from;

    /**
     * The 'read_by_(static)' property, displayed as 'Read by (Static)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(static)") protected ReferenceList read_by__static_;

    /**
     * The 'written_by_(static)' property, displayed as 'Written by (Static)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(static)") protected ReferenceList written_by__static_;

    /**
     * The 'read_by_(design)' property, displayed as 'Read by (Design)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(design)") protected ReferenceList read_by__design_;

    /**
     * The 'written_by_(design)' property, displayed as 'Written by (Design)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(design)") protected ReferenceList written_by__design_;

    /**
     * The 'read_by_(operational)' property, displayed as 'Read by (Operational)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(operational)") protected ReferenceList read_by__operational_;

    /**
     * The 'written_by_(operational)' property, displayed as 'Written by (Operational)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(operational)") protected ReferenceList written_by__operational_;

    /**
     * The 'read_by_(user_defined)' property, displayed as 'Read by (User-Defined)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("read_by_(user_defined)") protected ReferenceList read_by__user_defined_;

    /**
     * The 'written_by_(user_defined)' property, displayed as 'Written by (User-Defined)' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    @JsonProperty("written_by_(user_defined)") protected ReferenceList written_by__user_defined_;

    /**
     * The 'impacted_by' property, displayed as 'Impacted by' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    protected ReferenceList impacted_by;

    /**
     * The 'impacts_on' property, displayed as 'Impacts on' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationAsset} objects.
     */
    protected ReferenceList impacts_on;

    /**
     * The 'include_for_business_lineage' property, displayed as 'Include for Business Lineage' in the IGC UI.
     */
    protected Boolean include_for_business_lineage;

    /**
     * The 'suggested_term_assignments' property, displayed as 'Suggested Term Assignments' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link TermAssignment} objects.
     */
    protected ReferenceList suggested_term_assignments;

    /**
     * The 'blueprint_elements' property, displayed as 'Blueprint Elements' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link BlueprintElementLink} objects.
     */
    protected ReferenceList blueprint_elements;

    /**
     * The 'in_collections' property, displayed as 'In Collections' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Collection} objects.
     */
    protected ReferenceList in_collections;

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

    /**
     * The 'amazon_s3_data_files' property, displayed as 'Amazon S3 Data Files' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link AmazonS3DataFile} object.
     */
    protected Reference amazon_s3_data_files;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #parent_folder_or_host */ @JsonProperty("parent_folder_or_host")  public ReferenceList getParentFolderOrHost() { return this.parent_folder_or_host; }
    /** @see #parent_folder_or_host */ @JsonProperty("parent_folder_or_host")  public void setParentFolderOrHost(ReferenceList parent_folder_or_host) { this.parent_folder_or_host = parent_folder_or_host; }

    /** @see #parent_folder */ @JsonProperty("parent_folder")  public Reference getParentFolder() { return this.parent_folder; }
    /** @see #parent_folder */ @JsonProperty("parent_folder")  public void setParentFolder(Reference parent_folder) { this.parent_folder = parent_folder; }

    /** @see #host */ @JsonProperty("host")  public Reference getHost() { return this.host; }
    /** @see #host */ @JsonProperty("host")  public void setHost(Reference host) { this.host = host; }

    /** @see #labels */ @JsonProperty("labels")  public ReferenceList getLabels() { return this.labels; }
    /** @see #labels */ @JsonProperty("labels")  public void setLabels(ReferenceList labels) { this.labels = labels; }

    /** @see #stewards */ @JsonProperty("stewards")  public ReferenceList getStewards() { return this.stewards; }
    /** @see #stewards */ @JsonProperty("stewards")  public void setStewards(ReferenceList stewards) { this.stewards = stewards; }

    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public ReferenceList getAssignedToTerms() { return this.assigned_to_terms; }
    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public void setAssignedToTerms(ReferenceList assigned_to_terms) { this.assigned_to_terms = assigned_to_terms; }

    /** @see #implements_rules */ @JsonProperty("implements_rules")  public ReferenceList getImplementsRules() { return this.implements_rules; }
    /** @see #implements_rules */ @JsonProperty("implements_rules")  public void setImplementsRules(ReferenceList implements_rules) { this.implements_rules = implements_rules; }

    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public ReferenceList getGovernedByRules() { return this.governed_by_rules; }
    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public void setGovernedByRules(ReferenceList governed_by_rules) { this.governed_by_rules = governed_by_rules; }

    /** @see #data_file_records */ @JsonProperty("data_file_records")  public ReferenceList getDataFileRecords() { return this.data_file_records; }
    /** @see #data_file_records */ @JsonProperty("data_file_records")  public void setDataFileRecords(ReferenceList data_file_records) { this.data_file_records = data_file_records; }

    /** @see #implements_data_file_definition */ @JsonProperty("implements_data_file_definition")  public Reference getImplementsDataFileDefinition() { return this.implements_data_file_definition; }
    /** @see #implements_data_file_definition */ @JsonProperty("implements_data_file_definition")  public void setImplementsDataFileDefinition(Reference implements_data_file_definition) { this.implements_data_file_definition = implements_data_file_definition; }

    /** @see #implements_physical_models */ @JsonProperty("implements_physical_models")  public ReferenceList getImplementsPhysicalModels() { return this.implements_physical_models; }
    /** @see #implements_physical_models */ @JsonProperty("implements_physical_models")  public void setImplementsPhysicalModels(ReferenceList implements_physical_models) { this.implements_physical_models = implements_physical_models; }

    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public String getAliasBusinessName() { return this.alias__business_name_; }
    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public void setAliasBusinessName(String alias__business_name_) { this.alias__business_name_ = alias__business_name_; }

    /** @see #path */ @JsonProperty("path")  public String getPath() { return this.path; }
    /** @see #path */ @JsonProperty("path")  public void setPath(String path) { this.path = path; }

    /** @see #store_type */ @JsonProperty("store_type")  public String getStoreType() { return this.store_type; }
    /** @see #store_type */ @JsonProperty("store_type")  public void setStoreType(String store_type) { this.store_type = store_type; }

    /** @see #imported_from */ @JsonProperty("imported_from")  public String getImportedFrom() { return this.imported_from; }
    /** @see #imported_from */ @JsonProperty("imported_from")  public void setImportedFrom(String imported_from) { this.imported_from = imported_from; }

    /** @see #read_by__static_ */ @JsonProperty("read_by_(static)")  public ReferenceList getReadByStatic() { return this.read_by__static_; }
    /** @see #read_by__static_ */ @JsonProperty("read_by_(static)")  public void setReadByStatic(ReferenceList read_by__static_) { this.read_by__static_ = read_by__static_; }

    /** @see #written_by__static_ */ @JsonProperty("written_by_(static)")  public ReferenceList getWrittenByStatic() { return this.written_by__static_; }
    /** @see #written_by__static_ */ @JsonProperty("written_by_(static)")  public void setWrittenByStatic(ReferenceList written_by__static_) { this.written_by__static_ = written_by__static_; }

    /** @see #read_by__design_ */ @JsonProperty("read_by_(design)")  public ReferenceList getReadByDesign() { return this.read_by__design_; }
    /** @see #read_by__design_ */ @JsonProperty("read_by_(design)")  public void setReadByDesign(ReferenceList read_by__design_) { this.read_by__design_ = read_by__design_; }

    /** @see #written_by__design_ */ @JsonProperty("written_by_(design)")  public ReferenceList getWrittenByDesign() { return this.written_by__design_; }
    /** @see #written_by__design_ */ @JsonProperty("written_by_(design)")  public void setWrittenByDesign(ReferenceList written_by__design_) { this.written_by__design_ = written_by__design_; }

    /** @see #read_by__operational_ */ @JsonProperty("read_by_(operational)")  public ReferenceList getReadByOperational() { return this.read_by__operational_; }
    /** @see #read_by__operational_ */ @JsonProperty("read_by_(operational)")  public void setReadByOperational(ReferenceList read_by__operational_) { this.read_by__operational_ = read_by__operational_; }

    /** @see #written_by__operational_ */ @JsonProperty("written_by_(operational)")  public ReferenceList getWrittenByOperational() { return this.written_by__operational_; }
    /** @see #written_by__operational_ */ @JsonProperty("written_by_(operational)")  public void setWrittenByOperational(ReferenceList written_by__operational_) { this.written_by__operational_ = written_by__operational_; }

    /** @see #read_by__user_defined_ */ @JsonProperty("read_by_(user_defined)")  public ReferenceList getReadByUserDefined() { return this.read_by__user_defined_; }
    /** @see #read_by__user_defined_ */ @JsonProperty("read_by_(user_defined)")  public void setReadByUserDefined(ReferenceList read_by__user_defined_) { this.read_by__user_defined_ = read_by__user_defined_; }

    /** @see #written_by__user_defined_ */ @JsonProperty("written_by_(user_defined)")  public ReferenceList getWrittenByUserDefined() { return this.written_by__user_defined_; }
    /** @see #written_by__user_defined_ */ @JsonProperty("written_by_(user_defined)")  public void setWrittenByUserDefined(ReferenceList written_by__user_defined_) { this.written_by__user_defined_ = written_by__user_defined_; }

    /** @see #impacted_by */ @JsonProperty("impacted_by")  public ReferenceList getImpactedBy() { return this.impacted_by; }
    /** @see #impacted_by */ @JsonProperty("impacted_by")  public void setImpactedBy(ReferenceList impacted_by) { this.impacted_by = impacted_by; }

    /** @see #impacts_on */ @JsonProperty("impacts_on")  public ReferenceList getImpactsOn() { return this.impacts_on; }
    /** @see #impacts_on */ @JsonProperty("impacts_on")  public void setImpactsOn(ReferenceList impacts_on) { this.impacts_on = impacts_on; }

    /** @see #include_for_business_lineage */ @JsonProperty("include_for_business_lineage")  public Boolean getIncludeForBusinessLineage() { return this.include_for_business_lineage; }
    /** @see #include_for_business_lineage */ @JsonProperty("include_for_business_lineage")  public void setIncludeForBusinessLineage(Boolean include_for_business_lineage) { this.include_for_business_lineage = include_for_business_lineage; }

    /** @see #suggested_term_assignments */ @JsonProperty("suggested_term_assignments")  public ReferenceList getSuggestedTermAssignments() { return this.suggested_term_assignments; }
    /** @see #suggested_term_assignments */ @JsonProperty("suggested_term_assignments")  public void setSuggestedTermAssignments(ReferenceList suggested_term_assignments) { this.suggested_term_assignments = suggested_term_assignments; }

    /** @see #blueprint_elements */ @JsonProperty("blueprint_elements")  public ReferenceList getBlueprintElements() { return this.blueprint_elements; }
    /** @see #blueprint_elements */ @JsonProperty("blueprint_elements")  public void setBlueprintElements(ReferenceList blueprint_elements) { this.blueprint_elements = blueprint_elements; }

    /** @see #in_collections */ @JsonProperty("in_collections")  public ReferenceList getInCollections() { return this.in_collections; }
    /** @see #in_collections */ @JsonProperty("in_collections")  public void setInCollections(ReferenceList in_collections) { this.in_collections = in_collections; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    /** @see #amazon_s3_data_files */ @JsonProperty("amazon_s3_data_files")  public Reference getAmazonS3DataFiles() { return this.amazon_s3_data_files; }
    /** @see #amazon_s3_data_files */ @JsonProperty("amazon_s3_data_files")  public void setAmazonS3DataFiles(Reference amazon_s3_data_files) { this.amazon_s3_data_files = amazon_s3_data_files; }

    public static final Boolean canBeCreated() { return false; }
    public static final Boolean includesModificationDetails() { return true; }
    public static final ArrayList<String> NON_RELATIONAL_PROPERTIES = new ArrayList<String>() {{
        add("name");
        add("short_description");
        add("long_description");
        add("alias_(business_name)");
        add("path");
        add("store_type");
        add("imported_from");
        add("include_for_business_lineage");
        add("created_by");
        add("created_on");
        add("modified_by");
        add("modified_on");
    }};
    public static final ArrayList<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<String>() {{
        add("parent_folder_or_host");
        add("labels");
        add("stewards");
        add("assigned_to_terms");
        add("implements_rules");
        add("governed_by_rules");
        add("data_file_records");
        add("implements_physical_models");
        add("read_by_(static)");
        add("written_by_(static)");
        add("read_by_(design)");
        add("written_by_(design)");
        add("read_by_(operational)");
        add("written_by_(operational)");
        add("read_by_(user_defined)");
        add("written_by_(user_defined)");
        add("impacted_by");
        add("impacts_on");
        add("suggested_term_assignments");
        add("blueprint_elements");
        add("in_collections");
    }};
    public static final ArrayList<String> ALL_PROPERTIES = new ArrayList<String>() {{
        add("name");
        add("short_description");
        add("long_description");
        add("parent_folder_or_host");
        add("parent_folder");
        add("host");
        add("labels");
        add("stewards");
        add("assigned_to_terms");
        add("implements_rules");
        add("governed_by_rules");
        add("data_file_records");
        add("implements_data_file_definition");
        add("implements_physical_models");
        add("alias_(business_name)");
        add("path");
        add("store_type");
        add("imported_from");
        add("read_by_(static)");
        add("written_by_(static)");
        add("read_by_(design)");
        add("written_by_(design)");
        add("read_by_(operational)");
        add("written_by_(operational)");
        add("read_by_(user_defined)");
        add("written_by_(user_defined)");
        add("impacted_by");
        add("impacts_on");
        add("include_for_business_lineage");
        add("suggested_term_assignments");
        add("blueprint_elements");
        add("in_collections");
        add("created_by");
        add("created_on");
        add("modified_by");
        add("modified_on");
        add("amazon_s3_data_files");
    }};
    public static final List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static final List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static final List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static final Boolean isDataFile(Object obj) { return (obj.getClass() == DataFile.class); }

}
