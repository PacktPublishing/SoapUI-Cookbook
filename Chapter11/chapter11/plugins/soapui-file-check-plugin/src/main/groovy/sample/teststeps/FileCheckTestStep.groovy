package sample.teststeps

import org.apache.log4j.Logger

import com.eviware.soapui.SoapUI
import com.eviware.soapui.config.TestStepConfig
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepResult
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepWithProperties
import com.eviware.soapui.model.testsuite.TestCaseRunContext
import com.eviware.soapui.model.testsuite.TestCaseRunner
import com.eviware.soapui.model.testsuite.TestStepResult
import com.eviware.soapui.model.testsuite.TestStepResult.TestStepStatus
import com.eviware.soapui.support.UISupport

class FileCheckTestStep extends WsdlTestStepWithProperties{

	protected final Logger groovyLogger = Logger.getLogger("groovy.log")

	protected FileCheckTestStep(WsdlTestCase testCase, TestStepConfig config, boolean forLoadTest) {
		super(testCase, config, true, forLoadTest);

		if(!forLoadTest) {
			setIcon( UISupport.createImageIcon("filecheck.png"))
		}
	}

	@Override
	public TestStepResult run(TestCaseRunner testRunner, TestCaseRunContext context) {
		WsdlTestStepResult result = new WsdlTestStepResult(this)
		result.startTimer()

		//If fileToCheckFor poperty is not in the context, try to get it from the TestCase
		def fileToCheckForProperty = context.getProperty("fileToCheckFor")
		if (fileToCheckForProperty==null) fileToCheckForProperty = context.expand('${#TestCase#fileToCheckFor}')

		groovyLogger.info "Property fileToCheckFor="+fileToCheckForProperty

		if (fileToCheckForProperty.isEmpty()) {
			SoapUI.logError new Exception("Property fileToCheckFor must be supplied!")
			result.setStatus( TestStepStatus.FAILED)
			result.stopTimer()
			return result
		}

		def filePath = new File(fileToCheckForProperty)
		if (filePath.exists()) result.setStatus( TestStepStatus.OK ) else result.setStatus( TestStepStatus.FAILED)

		result.stopTimer()
		return result
	}
}
