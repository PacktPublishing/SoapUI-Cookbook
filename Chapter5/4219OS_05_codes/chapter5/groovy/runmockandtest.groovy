import com.eviware.soapui.tools.SoapUIMockServiceRunner
import com.eviware.soapui.tools.SoapUITestCaseRunner

SoapUIMockServiceRunner mockRunner = new SoapUIMockServiceRunner()
mockRunner.projectFile = args[0]
mockRunner.run()

println "Mock running..."

SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner()
testRunner.setProjectFile(args[0])
testRunner.run()