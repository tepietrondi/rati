package org.apache.cayenne.auto.rati.auto;

import java.util.List;

/** Class _Object was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _Object extends org.apache.cayenne.CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String REFERENCE_PROPERTY = "reference";
    public static final String RELATIONSHIPS_PROPERTY = "relationships";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void addToReference(org.apache.cayenne.auto.rati.Relationship obj) {
        addToManyTarget("reference", obj, true);
    }
    public void removeFromReference(org.apache.cayenne.auto.rati.Relationship obj) {
        removeToManyTarget("reference", obj, true);
    }
    public List getReference() {
        return (List)readProperty("reference");
    }
    
    
    public void addToRelationships(org.apache.cayenne.auto.rati.Relationship obj) {
        addToManyTarget("relationships", obj, true);
    }
    public void removeFromRelationships(org.apache.cayenne.auto.rati.Relationship obj) {
        removeToManyTarget("relationships", obj, true);
    }
    public List getRelationships() {
        return (List)readProperty("relationships");
    }
    
    
}
