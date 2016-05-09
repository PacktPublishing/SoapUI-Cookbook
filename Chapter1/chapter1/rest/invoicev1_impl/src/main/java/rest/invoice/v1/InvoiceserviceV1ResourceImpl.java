/**
 * Created by Apache CXF WadlToJava code generator
**/
package rest.invoice.v1;


public class InvoiceserviceV1ResourceImpl implements InvoiceserviceV1Resource {


    public Invoice getInvoiceid(String id) {
        ObjectFactory objectFactory = new ObjectFactory();
        Invoice invoice = objectFactory.createInvoice();
        invoice.setId("12345");
        invoice.setCompanyName("Test Company");
        invoice.setAmount(100.0d);
        return invoice;
    }

}