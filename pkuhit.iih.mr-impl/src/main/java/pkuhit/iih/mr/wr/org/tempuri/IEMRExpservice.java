
package pkuhit.iih.mr.wr.org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IEMRExpservice", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://192.168.70.72:8080/emrexp/wsdl/IEMRExp")
public class IEMRExpservice
    extends Service
{

    private final static URL IEMREXPSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(pkuhit.iih.mr.wr.org.tempuri.IEMRExpservice.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = pkuhit.iih.mr.wr.org.tempuri.IEMRExpservice.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.70.72:8080/emrexp/wsdl/IEMRExp");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.70.72:8080/emrexp/wsdl/IEMRExp', retrying as a local file");
            logger.warning(e.getMessage());
        }
        IEMREXPSERVICE_WSDL_LOCATION = url;
    }

    public IEMRExpservice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IEMRExpservice() {
        super(IEMREXPSERVICE_WSDL_LOCATION, new QName("http://tempuri.org/", "IEMRExpservice"));
    }

    /**
     * 
     * @return
     *     returns IEMRExp
     */
    @WebEndpoint(name = "IEMRExpPort")
    public IEMRExp getIEMRExpPort() {
        return super.getPort(new QName("http://tempuri.org/", "IEMRExpPort"), IEMRExp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEMRExp
     */
    @WebEndpoint(name = "IEMRExpPort")
    public IEMRExp getIEMRExpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "IEMRExpPort"), IEMRExp.class, features);
    }

}