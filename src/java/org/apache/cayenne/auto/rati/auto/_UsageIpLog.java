package org.apache.cayenne.auto.rati.auto;

/** Class _UsageIpLog was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _UsageIpLog extends org.apache.cayenne.CayenneDataObject {

    public static final String IP_ADDRESS_PROPERTY = "ipAddress";

    public static final String ID_PK_COLUMN = "ID";

    public void setIpAddress(String ipAddress) {
        writeProperty("ipAddress", ipAddress);
    }
    public String getIpAddress() {
        return (String)readProperty("ipAddress");
    }
    
    
}
