import org.junit.Test;

import com.eviware.soapui.tools.SoapUIMockServiceRunner;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TestRunMockAndTest {

	@Test
	public void test() throws Exception {
		String project = "/soapui-cookbook/chapter3/SOAPMock-soapui-project.xml";
		
		SoapUIMockServiceRunner mockRunner = new SoapUIMockServiceRunner();
		mockRunner.setProjectFile(project);
		mockRunner.run();

		System.out.println ("Mock running...");

		SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner();
		testRunner.setProjectFile(project);
		testRunner.run();
	}

}