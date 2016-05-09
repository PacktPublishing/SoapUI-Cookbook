package sample.listeners

import org.apache.log4j.Logger
import com.eviware.soapui.impl.wsdl.submit.filters.AbstractRequestFilter
import com.eviware.soapui.model.iface.Request
import com.eviware.soapui.model.iface.SubmitContext

class RequestFilterListener extends AbstractRequestFilter {
	
	protected final Logger scriptLogger = Logger.getLogger("groovy.log")
	
	@Override
	public void filterRequest(SubmitContext context, Request request) {

		scriptLogger.info context
		scriptLogger.info request
		//Add a parameter to the uri
		String uri = context.httpMethod.URI.toString()
		uri+="?param=value"
		scriptLogger.info "uri: "+uri
		context.httpMethod.URI = URI.create(uri)
	}
}