@GrabResolver(name='soapui', root='http://www.soapui.org/repository/maven2')
@Grab(group='com.smartbear.soapui', module='soapui', version='5.1.2-m-SNAPSHOT')
@GrabExclude('jtidy:jtidy')
@GrabExclude('gnu.cajo:cajo')
import com.eviware.soapui.tools.SoapUILoadTestRunner

SoapUILoadTestRunner loadTestRunner = new SoapUILoadTestRunner()
loadTestRunner.projectFile="../InvoiceV3LoadTest-soapui-project.xml"
loadTestRunner.testSuite="TestSuite-Seperate Data Per Thread"
loadTestRunner.testCase="CreateInvoiceTestCase-Seperate"
loadTestRunner.loadTest="SeperateDataPerThreadLoadTest"
loadTestRunner.limit=100
loadTestRunner.printReport=true
loadTestRunner.outputFolder="../reports"
loadTestRunner.run()