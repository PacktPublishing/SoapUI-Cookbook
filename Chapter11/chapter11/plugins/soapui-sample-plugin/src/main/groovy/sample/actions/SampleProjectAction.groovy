package sample.actions

import com.eviware.soapui.impl.wsdl.WsdlProject
import com.eviware.soapui.support.action.support.AbstractSoapUIAction

public class SampleProjectAction extends AbstractSoapUIAction<WsdlProject>{

	public SampleProjectAction() {
		super("Sample Groovy Project Action", "Doesn't do anything!")
	}

	@Override
	public void perform( WsdlProject project, Object param ) {
		
	}

}
