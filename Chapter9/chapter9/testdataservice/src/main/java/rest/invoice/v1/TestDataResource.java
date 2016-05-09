/**
 * Created by Apache CXF WadlToJava code generator
**/
package rest.invoice.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/test-data-service/")
public interface TestDataResource {

    @GET
    @Produces("application/xml")
    @Path("invoice/")
    Invoice getInvoice();

}