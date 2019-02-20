package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2019-02-21T01:01:07.283+04:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "DataAccess_TransactionStatus", 
                  wsdlLocation = "file:/Users/serhat/RedHat/accountsV2/DBX-MODC/poc/mocd-dataaccess-service/WebContent/wsdl/DataAccess.wsdl",
                  targetNamespace = "http://tempuri.org/") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00", comments = "Apache CXF 3.1.7")
public class DataAccessTransactionStatus extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public final static QName SERVICE = new QName("http://tempuri.org/", "DataAccess_TransactionStatus");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public final static QName DataAccessTransactionStatusSoap = new QName("http://tempuri.org/", "DataAccess_TransactionStatusSoap");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public final static QName DataAccessTransactionStatusSoap12 = new QName("http://tempuri.org/", "DataAccess_TransactionStatusSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/serhat/RedHat/accountsV2/DBX-MODC/poc/mocd-dataaccess-service/WebContent/wsdl/DataAccess.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DataAccessTransactionStatus.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/serhat/RedHat/accountsV2/DBX-MODC/poc/mocd-dataaccess-service/WebContent/wsdl/DataAccess.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatus(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DataAccessTransactionStatusSoap
     */
    @WebEndpoint(name = "DataAccess_TransactionStatusSoap")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatusSoap getDataAccessTransactionStatusSoap() {
        return super.getPort(DataAccessTransactionStatusSoap, DataAccessTransactionStatusSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataAccessTransactionStatusSoap
     */
    @WebEndpoint(name = "DataAccess_TransactionStatusSoap")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatusSoap getDataAccessTransactionStatusSoap(WebServiceFeature... features) {
        return super.getPort(DataAccessTransactionStatusSoap, DataAccessTransactionStatusSoap.class, features);
    }


    /**
     *
     * @return
     *     returns DataAccessTransactionStatusSoap
     */
    @WebEndpoint(name = "DataAccess_TransactionStatusSoap12")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatusSoap getDataAccessTransactionStatusSoap12() {
        return super.getPort(DataAccessTransactionStatusSoap12, DataAccessTransactionStatusSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DataAccessTransactionStatusSoap
     */
    @WebEndpoint(name = "DataAccess_TransactionStatusSoap12")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-02-21T01:01:07.283+04:00")
    public DataAccessTransactionStatusSoap getDataAccessTransactionStatusSoap12(WebServiceFeature... features) {
        return super.getPort(DataAccessTransactionStatusSoap12, DataAccessTransactionStatusSoap.class, features);
    }

}