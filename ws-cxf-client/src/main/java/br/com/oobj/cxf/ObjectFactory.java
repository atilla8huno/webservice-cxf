
package br.com.oobj.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.oobj.cxf package. 
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

    private final static QName _ConsomeXMLResponse_QNAME = new QName("http://cxf.oobj.com.br/", "consomeXMLResponse");
    private final static QName _ImprimirNotaDaEmpresa_QNAME = new QName("http://cxf.oobj.com.br/", "imprimirNotaDaEmpresa");
    private final static QName _ConsomeXML_QNAME = new QName("http://cxf.oobj.com.br/", "consomeXML");
    private final static QName _ImprimirNotaDaEmpresaResponse_QNAME = new QName("http://cxf.oobj.com.br/", "imprimirNotaDaEmpresaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.oobj.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsomeXMLResponse }
     * 
     */
    public ConsomeXMLResponse createConsomeXMLResponse() {
        return new ConsomeXMLResponse();
    }

    /**
     * Create an instance of {@link ImprimirNotaDaEmpresa }
     * 
     */
    public ImprimirNotaDaEmpresa createImprimirNotaDaEmpresa() {
        return new ImprimirNotaDaEmpresa();
    }

    /**
     * Create an instance of {@link ConsomeXML }
     * 
     */
    public ConsomeXML createConsomeXML() {
        return new ConsomeXML();
    }

    /**
     * Create an instance of {@link ImprimirNotaDaEmpresaResponse }
     * 
     */
    public ImprimirNotaDaEmpresaResponse createImprimirNotaDaEmpresaResponse() {
        return new ImprimirNotaDaEmpresaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsomeXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.oobj.com.br/", name = "consomeXMLResponse")
    public JAXBElement<ConsomeXMLResponse> createConsomeXMLResponse(ConsomeXMLResponse value) {
        return new JAXBElement<ConsomeXMLResponse>(_ConsomeXMLResponse_QNAME, ConsomeXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirNotaDaEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.oobj.com.br/", name = "imprimirNotaDaEmpresa")
    public JAXBElement<ImprimirNotaDaEmpresa> createImprimirNotaDaEmpresa(ImprimirNotaDaEmpresa value) {
        return new JAXBElement<ImprimirNotaDaEmpresa>(_ImprimirNotaDaEmpresa_QNAME, ImprimirNotaDaEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsomeXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.oobj.com.br/", name = "consomeXML")
    public JAXBElement<ConsomeXML> createConsomeXML(ConsomeXML value) {
        return new JAXBElement<ConsomeXML>(_ConsomeXML_QNAME, ConsomeXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImprimirNotaDaEmpresaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.oobj.com.br/", name = "imprimirNotaDaEmpresaResponse")
    public JAXBElement<ImprimirNotaDaEmpresaResponse> createImprimirNotaDaEmpresaResponse(ImprimirNotaDaEmpresaResponse value) {
        return new JAXBElement<ImprimirNotaDaEmpresaResponse>(_ImprimirNotaDaEmpresaResponse_QNAME, ImprimirNotaDaEmpresaResponse.class, null, value);
    }

}
