import com.eviware.soapui.tools.SoapUIMockServiceRunner;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class RunMockAndTest {

	public static void main(String[] args) throws Exception {

		SoapUIMockServiceRunner mockRunner = new SoapUIMockServiceRunner();
		mockRunner.setProjectFile(args[0]);
		mockRunner.run();

		System.out.println ("Mock running...");

		SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner();
		testRunner.setProjectFile(args[0]);
		testRunner.run();

		System.exit(0);
	}
}
