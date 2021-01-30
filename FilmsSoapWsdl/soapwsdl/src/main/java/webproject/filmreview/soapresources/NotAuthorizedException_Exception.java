
package webproject.filmreview.soapresources;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NotAuthorizedException", targetNamespace = "http://SoapResources.filmreview.webproject/")
public class NotAuthorizedException_Exception
    extends Exception
{

    /**
     *
     */
    private static final long serialVersionUID = -8450326749885932495L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NotAuthorizedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NotAuthorizedException_Exception(String message, NotAuthorizedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NotAuthorizedException_Exception(String message, NotAuthorizedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: webproject.filmreview.soapresources.NotAuthorizedException
     */
    public NotAuthorizedException getFaultInfo() {
        return faultInfo;
    }

}
