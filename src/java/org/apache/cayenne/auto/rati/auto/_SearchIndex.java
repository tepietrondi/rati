package org.apache.cayenne.auto.rati.auto;

/** Class _SearchIndex was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _SearchIndex extends org.apache.cayenne.CayenneDataObject {

    public static final String COMBINED_ATTRIBUTES_PROPERTY = "combinedAttributes";
    public static final String OBJECT_NAME_PROPERTY = "objectName";
    public static final String PERSPECTIVE_PROPERTY = "perspective";
    public static final String RANK_PROPERTY = "rank";
    public static final String WEIGHT_PROPERTY = "weight";
    public static final String OBJECT_NAME_RELATIONSHIP_PROPERTY = "objectNameRelationship";

    public static final String ID_PK_COLUMN = "ID";

    public void setCombinedAttributes(String combinedAttributes) {
        writeProperty("combinedAttributes", combinedAttributes);
    }
    public String getCombinedAttributes() {
        return (String)readProperty("combinedAttributes");
    }
    
    
    public void setObjectName(String objectName) {
        writeProperty("objectName", objectName);
    }
    public String getObjectName() {
        return (String)readProperty("objectName");
    }
    
    
    public void setPerspective(String perspective) {
        writeProperty("perspective", perspective);
    }
    public String getPerspective() {
        return (String)readProperty("perspective");
    }
    
    
    public void setRank(Long rank) {
        writeProperty("rank", rank);
    }
    public Long getRank() {
        return (Long)readProperty("rank");
    }
    
    
    public void setWeight(Long weight) {
        writeProperty("weight", weight);
    }
    public Long getWeight() {
        return (Long)readProperty("weight");
    }
    
    
    public void setObjectNameRelationship(org.apache.cayenne.auto.rati.Object objectNameRelationship) {
        setToOneTarget("objectNameRelationship", objectNameRelationship, true);
    }

    public org.apache.cayenne.auto.rati.Object getObjectNameRelationship() {
        return (org.apache.cayenne.auto.rati.Object)readProperty("objectNameRelationship");
    } 
    
    
}
