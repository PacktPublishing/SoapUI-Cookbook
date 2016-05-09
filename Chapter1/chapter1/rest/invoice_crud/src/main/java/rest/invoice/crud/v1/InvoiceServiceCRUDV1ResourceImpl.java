package rest.invoice.crud.v1;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class InvoiceServiceCRUDV1ResourceImpl implements
		InvoiceServiceCRUDV1Resource {

	private Map<String, Invoice> invoices = new HashMap<String, Invoice>();
	private long nextId=0;

	public Invoice getInvoice(String id) {
		Invoice invoice = invoices.get(id);
		if (invoice == null)
			throwExceptionResponse(404, "Invoice with id="+id+" was not found");
		return invoice;
	}

	@Override
	public Invoice createInvoice(Invoice invoice) {

		if (invoice != null) {
			String invoiceId = simpleIdGenerator();
			invoice.setId(invoiceId);
			invoices.put(invoiceId, invoice);
		}
		return invoice;
	}

	@Override
	public Invoice updateInvoice(String id, Invoice invoice) {
		
		Invoice currentInvoice = invoices.get(id);
		if (currentInvoice!=null) {
			currentInvoice.setCompanyName(invoice.getCompanyName());
			currentInvoice.setAmount(invoice.getAmount());
			invoices.put(id, currentInvoice);
		}else{
			throwExceptionResponse(404, "Invoice with id="+id+" was not found");
		}
		return currentInvoice;
	}

	@Override
	public Response deleteInvoice(String id) {

		if (invoices.get(id) != null) {
			invoices.remove(id);
			return Response.ok().build();
		}
		return Response.status(404).build();
	}
	
	private String simpleIdGenerator(){
		return "inv"+nextId++;
	}

	private void throwExceptionResponse(int responseCode, String message) {
		ResponseBuilder builder = Response.status(responseCode);
		builder.type("text/plain");
		builder.entity(message);
		throw new WebApplicationException(builder.build());
	}
}