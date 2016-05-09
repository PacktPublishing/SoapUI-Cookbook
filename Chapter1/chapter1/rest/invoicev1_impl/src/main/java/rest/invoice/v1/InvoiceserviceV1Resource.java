/**
 * Created by Apache CXF WadlToJava code generator
**/
package rest.invoice.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/invoiceservice/v1/")
public interface InvoiceserviceV1Resource {

    @GET
    @Produces("application/json")
    @Path("/invoice/{id}/")
    Invoice getInvoiceid(@PathParam("id") String id);

}