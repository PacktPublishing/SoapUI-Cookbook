package sample.actions

import org.apache.log4j.Logger
import com.eviware.soapui.SoapUI
import com.eviware.soapui.impl.wsdl.WsdlProject
import com.eviware.soapui.support.action.support.AbstractSoapUIAction

public class LoggingProjectAction extends AbstractSoapUIAction<WsdlProject>{

	protected final Logger soapuiLogFileLogger = Logger.getLogger(getClass())
	protected final Logger scriptLogger = Logger.getLogger("groovy.log")
	
	public LoggingProjectAction() {
		super("Logging Project Action", "Logs some stuff!")
	}

	@Override
	public void perform( WsdlProject project, Object param ) {
		//Log something to the soapui.log file in <SoapUI Home>/bin
		soapuiLogFileLogger.info "Hello from logging Action plugin!"
		
		//Log something to the groovy.log (shows in script log tab and soapui.log)
		scriptLogger.info "Hello script log from logging Action plugin!"
		
		////Log message to soapui log tab
		SoapUI.log "Hello from soapui log SoapUI.log"

		//Log error to soapui log tab and stack trace in error log tab
		SoapUI.logError new Exception("Something went wrong!!")
	}
}
