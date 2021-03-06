
package pkuhit.iih.mr.wr.org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IEMRExp", targetNamespace = "http://tempuri.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IEMRExp {


    /**
     * 
     * @param wsCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetEmrFramework", action = "urn:EMRExpIntf-IEMRExp#GetEmrFramework")
    @WebResult(partName = "return")
    public String getEmrFramework(
        @WebParam(name = "WSCode", partName = "WSCode")
        String wsCode);

    /**
     * 
     * @param frameworkCode
     * @param patid
     * @param wsCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPatChildNodes", action = "urn:EMRExpIntf-IEMRExp#GetPatChildNodes")
    @WebResult(partName = "return")
    public String getPatChildNodes(
        @WebParam(name = "WSCode", partName = "WSCode")
        String wsCode,
        @WebParam(name = "Patid", partName = "Patid")
        String patid,
        @WebParam(name = "FrameworkCode", partName = "FrameworkCode")
        String frameworkCode);

    /**
     * 
     * @param frameworkCode
     * @param wsCode
     * @param colId
     * @param recId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDocXML", action = "urn:EMRExpIntf-IEMRExp#GetDocXML")
    @WebResult(partName = "return")
    public String getDocXML(
        @WebParam(name = "WSCode", partName = "WSCode")
        String wsCode,
        @WebParam(name = "FrameworkCode", partName = "FrameworkCode")
        String frameworkCode,
        @WebParam(name = "RecId", partName = "RecId")
        String recId,
        @WebParam(name = "ColId", partName = "ColId")
        String colId);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Test", action = "urn:EMRExpIntf-IEMRExp#Test")
    @WebResult(partName = "return")
    public String test();

}
