
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ws.invoice.v3;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-18T13:37:51.065+01:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "InvoiceServiceV3",
                      portName = "InvoicePort",
                      targetNamespace = "http://soapui.cookbook.samples/contract/invoice",
                      wsdlLocation = "invoice_v3.wsdl",
                      endpointInterface = "ws.invoice.v3.InvoicePortType")
                      
public class InvoicePortImpl implements InvoicePortType {

    private static final Logger LOG = Logger.getLogger(InvoicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see ws.invoice.v3.InvoicePortType#deleteInvoice(java.lang.String  invoiceNo )*
     */
    public void deleteInvoice(java.lang.String invoiceNo) { 
        LOG.info("Executing operation deleteInvoice");
        System.out.println(invoiceNo);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ws.invoice.v3.InvoicePortType#createInvoice(java.lang.String  id ,)java.lang.String  customerRef ,)double  amount ,)javax.xml.datatype.XMLGregorianCalendar  dueDate )*
     */
    public java.lang.String createInvoice(java.lang.String id,java.lang.String customerRef,double amount,javax.xml.datatype.XMLGregorianCalendar dueDate) { 
        LOG.info("Executing operation createInvoice");
        System.out.println(id);
        System.out.println(customerRef);
        System.out.println(amount);
        System.out.println(dueDate);
        try {
            java.lang.String _return = "12345";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ws.invoice.v3.InvoicePortType#retrieveInvoice(java.lang.String  invoiceNo ,)java.lang.String  id ,)java.lang.String  customerRef ,)java.lang.Double  amount ,)javax.xml.datatype.XMLGregorianCalendar  dueDate )*
     */
    public void retrieveInvoice(java.lang.String invoiceNo,javax.xml.ws.Holder<java.lang.String> id,javax.xml.ws.Holder<java.lang.String> customerRef,javax.xml.ws.Holder<java.lang.Double> amount,javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> dueDate) { 
        LOG.info("Executing operation retrieveInvoice");
        System.out.println(invoiceNo);
        try {
            java.lang.String idValue = "12345";
            id.value = idValue;
            java.lang.String customerRefValue = "3333";
            customerRef.value = customerRefValue;
            java.lang.Double amountValue = 100.0d;
            amount.value = amountValue;
            javax.xml.datatype.XMLGregorianCalendar dueDateValue = null;
            dueDate.value = dueDateValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ws.invoice.v3.InvoicePortType#updateInvoice(java.lang.String  id ,)java.lang.String  customerRef ,)double  amount ,)javax.xml.datatype.XMLGregorianCalendar  dueDate )*
     */
    public java.lang.String updateInvoice(java.lang.String id,java.lang.String customerRef,double amount,javax.xml.datatype.XMLGregorianCalendar dueDate) { 
        LOG.info("Executing operation updateInvoice");
        System.out.println(id);
        System.out.println(customerRef);
        System.out.println(amount);
        System.out.println(dueDate);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
