/**
 * Created by Apache CXF WadlToJava code generator
**/
package rest.invoice.v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestDataResourceImpl implements TestDataResource {

	private List<String> testDataRows;
    
    int rowCounter = -1;

    //Synchronized accessor to get next row counter
    private synchronized int getRowCounter()
    {
        //Reset counter to beginning if at end of file i.e. loop datasource
    	if (++rowCounter==testDataRows.size()) rowCounter=0;
        return rowCounter;
    }
    
    public TestDataResourceImpl(String filePath) throws FileNotFoundException{
    	
    	//Load CSV test data once on startup
    	Scanner testDataFile = new Scanner(new File(filePath));
    	testDataRows = new ArrayList<String>();
    	while (testDataFile.hasNext()){
    		testDataRows.add(testDataFile.next());
    	}
    	testDataFile.close();
    	System.out.println("Loaded "+testDataRows.size()+" rows of test data from "+filePath);
    }

    public Invoice getInvoice() {
        ObjectFactory objectFactory = new ObjectFactory();
        Invoice invoice = objectFactory.createInvoice();
    
        int row = getRowCounter();
        String nextRow = testDataRows.get(row);
    
        invoice.setId(nextRow.split(",")[0]);
        invoice.setCompanyName(nextRow.split(",")[1]);
        invoice.setAmount(Double.parseDouble(nextRow.split(",")[2]));
        return invoice;
    }

}