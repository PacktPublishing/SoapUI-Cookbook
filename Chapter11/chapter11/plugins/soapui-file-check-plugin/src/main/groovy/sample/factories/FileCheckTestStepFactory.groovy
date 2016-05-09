package sample.factories

import sample.teststeps.FileCheckTestStep
import com.eviware.soapui.config.TestStepConfig
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep
import com.eviware.soapui.impl.wsdl.teststeps.registry.WsdlTestStepFactory

class FileCheckTestStepFactory extends WsdlTestStepFactory {
	private static final String FILECHECK_STEP_ID = "fileCheck"

	public FileCheckTestStepFactory() {
		super(FILECHECK_STEP_ID, "File Check TestStep", "Checks if a file exists", "filecheck.png")
	}

	public WsdlTestStep buildTestStep(WsdlTestCase testCase, TestStepConfig config, boolean forLoadTest) {
		return new FileCheckTestStep(testCase, config, forLoadTest)
	}

	public TestStepConfig createNewTestStep(WsdlTestCase testCase, String name) {
		TestStepConfig testStepConfig = TestStepConfig.Factory.newInstance()
		testStepConfig.setType(FILECHECK_STEP_ID)
		testStepConfig.setName(name)
		return testStepConfig
	}

	public boolean canCreate() {
		return true
	}
}
