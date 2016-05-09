import org.junit.Test;

import com.eviware.soapui.tools.SoapUIMockServiceRunner;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class RunMockAndTestIntegrationTest {

	@Test
	public void test() throws Exception {
		String project = "/soapui-cookbook/chapter3/SOAPMock-soapui-project.xml";
		String soapUIHome = "/work/soapui-cookbook/soap-ui-51/soapui/soapui-installer/target/assemblies/SoapUI-5.2.0-SNAPSHOT-dist";

		SoapUIMockServiceRunner mockRunner = new SoapUIMockServiceRunner();

		mockRunner.setProjectFile(project);
		String[] sysProps = {"soapui.ext.libraries="+soapUIHome+"/bin/ext"};
		mockRunner.setSystemProperties(sysProps);
		mockRunner.run();

		System.out.println ("Mock running...");

		SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner();
		testRunner.setProjectFile(project);
		testRunner.run();
	}

}