package rest.invoice.v1;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class Server {

    protected Server(String filePath) throws Exception {
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(TestDataResourceImpl.class);
        sf.setResourceProvider(TestDataResourceImpl.class, 
            new SingletonResourceProvider(new TestDataResourceImpl(filePath)));
        sf.setAddress("http://localhost:9000/");
        sf.create();
    }

    public static void main(String args[]) throws Exception {
        if (args.length==0) {
        	System.out.println("Please supply a the the location of some invoice test data e.g. /temp/invoices.csv");
        	return;
        }
    	new Server(args[0]);
        System.out.println("Server ready, will exit automatically after 30 minutes...");
        Thread.sleep(30 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
