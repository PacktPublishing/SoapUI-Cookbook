@GrabResolver(name='soapui', root='http://www.soapui.org/repository/maven2')
@Grab(group='com.smartbear.soapui', module='soapui', version='5.1.2-m-SNAPSHOT')
@GrabExclude('jtidy:jtidy')
@GrabExclude('gnu.cajo:cajo')
import com.eviware.soapui.tools.SoapUIMockServiceRunner
import com.eviware.soapui.tools.SoapUITestCaseRunner

SoapUIMockServiceRunner mockRunner = new SoapUIMockServiceRunner()
mockRunner.projectFile = args[0]
mockRunner.run()

println "Mock running..."

SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner()
testRunner.setProjectFile(args[0])
testRunner.run()