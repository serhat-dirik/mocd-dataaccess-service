
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.io.IOException;
import java.util.logging.Logger;
import javax.annotation.Generated;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.namespace.QName;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2019-02-21T01:01:07.273+04:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "DataAccess_TransactionStatus",
                      portName = "DataAccess_TransactionStatusSoap12",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "file:/Users/serhat/RedHat/accountsV2/DBX-MODC/poc/mocd-dataaccess-service/WebContent/wsdl/DataAccess.wsdl",
                      endpointInterface = "org.tempuri.DataAccessTransactionStatusSoap")
                      
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.273+04:00", comments = "Apache CXF 3.1.7")
public class DataAccess_TransactionStatusSoap12Impl implements DataAccessTransactionStatusSoap {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.273+04:00")
    private static final Logger LOG = Logger.getLogger(DataAccess_TransactionStatusSoap12Impl.class.getName());

    @Resource
    private WebServiceContext context;
    
    /* (non-Javadoc)
     * @see org.tempuri.DataAccessTransactionStatusSoap#getTransactionInfo(java.lang.String applicationNo, java.lang.String licenseNumber, org.tempuri.Authentication authentication)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.273+04:00")
    public org.tempuri.ArrayOfDataTable getTransactionInfo(java.lang.String applicationNo, java.lang.String licenseNumber, Authentication authentication) { 
        LOG.info("Executing operation getTransactionInfo");
        System.out.println(applicationNo);
        System.out.println(licenseNumber);
        System.out.println(authentication);
        org.tempuri.ArrayOfDataTable _return = null;
        MessageContext ctx = context.getMessageContext();
        HttpServletResponse response = (HttpServletResponse) 
                ctx.get(MessageContext.SERVLET_RESPONSE);
        if(authentication == null||! authentication.getUsername().equalsIgnoreCase("user") || ! authentication.getPassword().equalsIgnoreCase("password")) {
            try {
				response.sendError(404, "Authorization Error!");
			} catch (IOException e) {
				LOG.info("UnAuthorized user access!!!");
			}
        }else {
        	try {
                _return = new ArrayOfDataTable();
                ArrayOfDataTable.DataTable dataTable1 = new ArrayOfDataTable.DataTable();
                dataTable1.getAny().add(new JAXBElement(new QName("http://www.w3.org/2001/XMLSchema", "string",	"xs"), 
            		    String.class, "data 1"));
                dataTable1.getAny().add(new JAXBElement(new QName("http://www.w3.org/2001/XMLSchema", "string",	"xs"), 
            		    String.class, "data 2"));
                _return.getDataTable().add(dataTable1);
                ArrayOfDataTable.DataTable dataTable2 = new ArrayOfDataTable.DataTable();
                dataTable2.getAny().add(new JAXBElement(new QName("http://www.w3.org/2001/XMLSchema", "string",	"xs"), 
            		    String.class, "data 3"));
                dataTable2.getAny().add(new JAXBElement(new QName("http://www.w3.org/2001/XMLSchema", "string",	"xs"), 
            		    String.class, "data 4"));
                _return.getDataTable().add(dataTable2);
                 
               
            } catch (java.lang.Exception ex) {
            	LOG.severe("Error");
                ex.printStackTrace();
                try {
					response.sendError(500, "server error");
				} catch (IOException e) {
					
				}
            }	
        }
        return _return;
    }

}
