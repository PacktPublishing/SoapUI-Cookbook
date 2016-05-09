
package ws.invoice.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.invoice.v2 package. 
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

    private final static QName _InvoiceDocument_QNAME = new QName("http://soapui.cookbook.samples/schema/invoice", "InvoiceDocument");
    private final static QName _GetInvoice_QNAME = new QName("http://soapui.cookbook.samples/schema/invoice", "getInvoice");
    private final static QName _CreateInvoice_QNAME = new QName("http://soapui.cookbook.samples/schema/invoice", "createInvoice");
    private final static QName _Acknowledgement_QNAME = new QName("http://soapui.cookbook.samples/schema/invoice", "Acknowledgement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.invoice.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceRefType }
     * 
     */
    public InvoiceRefType createInvoiceRefType() {
        return new InvoiceRefType();
    }

    /**
     * Create an instance of {@link InvoiceDocumentType }
     * 
     */
    public InvoiceDocumentType createInvoiceDocumentType() {
        return new InvoiceDocumentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapui.cookbook.samples/schema/invoice", name = "InvoiceDocument")
    public JAXBElement<InvoiceDocumentType> createInvoiceDocument(InvoiceDocumentType value) {
        return new JAXBElement<InvoiceDocumentType>(_InvoiceDocument_QNAME, InvoiceDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapui.cookbook.samples/schema/invoice", name = "getInvoice")
    public JAXBElement<InvoiceRefType> createGetInvoice(InvoiceRefType value) {
        return new JAXBElement<InvoiceRefType>(_GetInvoice_QNAME, InvoiceRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapui.cookbook.samples/schema/invoice", name = "createInvoice")
    public JAXBElement<InvoiceDocumentType> createCreateInvoice(InvoiceDocumentType value) {
        return new JAXBElement<InvoiceDocumentType>(_CreateInvoice_QNAME, InvoiceDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapui.cookbook.samples/schema/invoice", name = "Acknowledgement")
    public JAXBElement<InvoiceRefType> createAcknowledgement(InvoiceRefType value) {
        return new JAXBElement<InvoiceRefType>(_Acknowledgement_QNAME, InvoiceRefType.class, null, value);
    }

}
