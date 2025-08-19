
package paqueteservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paqueteservicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Mayor_QNAME = new QName("http://paqueteServicio/", "mayor");
    private final static QName _MayorResponse_QNAME = new QName("http://paqueteServicio/", "mayorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paqueteservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mayor }
     * 
     */
    public Mayor createMayor() {
        return new Mayor();
    }

    /**
     * Create an instance of {@link MayorResponse }
     * 
     */
    public MayorResponse createMayorResponse() {
        return new MayorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mayor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "mayor")
    public JAXBElement<Mayor> createMayor(Mayor value) {
        return new JAXBElement<Mayor>(_Mayor_QNAME, Mayor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MayorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "mayorResponse")
    public JAXBElement<MayorResponse> createMayorResponse(MayorResponse value) {
        return new JAXBElement<MayorResponse>(_MayorResponse_QNAME, MayorResponse.class, null, value);
    }

}
