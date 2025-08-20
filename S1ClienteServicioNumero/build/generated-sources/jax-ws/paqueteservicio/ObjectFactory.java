
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
    private final static QName _Menor_QNAME = new QName("http://paqueteServicio/", "menor");
    private final static QName _MenorResponse_QNAME = new QName("http://paqueteServicio/", "menorResponse");
    private final static QName _Promedio_QNAME = new QName("http://paqueteServicio/", "promedio");
    private final static QName _PromedioResponse_QNAME = new QName("http://paqueteServicio/", "promedioResponse");

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
     * Create an instance of {@link Menor }
     * 
     */
    public Menor createMenor() {
        return new Menor();
    }

    /**
     * Create an instance of {@link MenorResponse }
     * 
     */
    public MenorResponse createMenorResponse() {
        return new MenorResponse();
    }

    /**
     * Create an instance of {@link Promedio }
     * 
     */
    public Promedio createPromedio() {
        return new Promedio();
    }

    /**
     * Create an instance of {@link PromedioResponse }
     * 
     */
    public PromedioResponse createPromedioResponse() {
        return new PromedioResponse();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Menor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "menor")
    public JAXBElement<Menor> createMenor(Menor value) {
        return new JAXBElement<Menor>(_Menor_QNAME, Menor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MenorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "menorResponse")
    public JAXBElement<MenorResponse> createMenorResponse(MenorResponse value) {
        return new JAXBElement<MenorResponse>(_MenorResponse_QNAME, MenorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Promedio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "promedio")
    public JAXBElement<Promedio> createPromedio(Promedio value) {
        return new JAXBElement<Promedio>(_Promedio_QNAME, Promedio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromedioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paqueteServicio/", name = "promedioResponse")
    public JAXBElement<PromedioResponse> createPromedioResponse(PromedioResponse value) {
        return new JAXBElement<PromedioResponse>(_PromedioResponse_QNAME, PromedioResponse.class, null, value);
    }

}
