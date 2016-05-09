package rest.invoice.v1;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class Server {

    protected Server() throws Exception {
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(InvoiceserviceV1ResourceImpl.class);
        sf.setResourceProvider(InvoiceserviceV1ResourceImpl.class, 
            new SingletonResourceProvider(new InvoiceserviceV1ResourceImpl()));
        sf.setAddress("http://localhost:9000/");
        sf.create();
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
