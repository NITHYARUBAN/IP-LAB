
package nitthu;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "carservice", targetNamespace = "http://nitthu/", wsdlLocation = "http://localhost:8080/car/carservice?wsdl")
public class Carservice_Service
    extends Service
{

    private final static URL CARSERVICE_WSDL_LOCATION;
    private final static WebServiceException CARSERVICE_EXCEPTION;
    private final static QName CARSERVICE_QNAME = new QName("http://nitthu/", "carservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/car/carservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CARSERVICE_WSDL_LOCATION = url;
        CARSERVICE_EXCEPTION = e;
    }

    public Carservice_Service() {
        super(__getWsdlLocation(), CARSERVICE_QNAME);
    }

    public Carservice_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARSERVICE_QNAME, features);
    }

    public Carservice_Service(URL wsdlLocation) {
        super(wsdlLocation, CARSERVICE_QNAME);
    }

    public Carservice_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARSERVICE_QNAME, features);
    }

    public Carservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Carservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Carservice
     */
    @WebEndpoint(name = "carservicePort")
    public Carservice getCarservicePort() {
        return super.getPort(new QName("http://nitthu/", "carservicePort"), Carservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Carservice
     */
    @WebEndpoint(name = "carservicePort")
    public Carservice getCarservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://nitthu/", "carservicePort"), Carservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARSERVICE_EXCEPTION!= null) {
            throw CARSERVICE_EXCEPTION;
        }
        return CARSERVICE_WSDL_LOCATION;
    }

}
