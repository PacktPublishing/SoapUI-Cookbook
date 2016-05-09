/**
 * Created by Apache CXF WadlToJava code generator
**/
package rest.invoice.crud.v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("invoiceservice/v1/")
public interface InvoiceServiceCRUDV1Resource {

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/invoice/")
	Invoice createInvoice(Invoice invoice);

	@GET
    @Produces("application/json")
    @Path("/invoice/{id}/")
    Invoice getInvoice(@PathParam("id") String id);
    
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/invoice/{id}")
	Invoice updateInvoice(@PathParam("id") String id, Invoice invoice);

	@DELETE
	@Path("/invoice/{id}")
	Response deleteInvoice(@PathParam("id") String id);
}