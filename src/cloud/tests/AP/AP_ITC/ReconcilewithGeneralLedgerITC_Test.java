package cloud.tests.AP.AP_ITC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import cloud.components.common.Login;
import cloud.components.common.Navigate_More;
import itc.framework.BaseTest;
import cloud.components.AP.AP_ITC.ReconcilewithGeneralLedgerITC;

public class ReconcilewithGeneralLedgerITC_Test extends BaseTest{

		@BeforeTest
		public void start(){
			startUp("chrome", this.getClass().getSimpleName()); 
		}

		@Test
		@Parameters({ "dataFile" ,"sheet","scenario"})
		public void executeTest(String dataFile1,String sheet1,String scenario1) throws Exception{
			testDataFile = dataFile1;
			scenario = scenario1;
			testsheet = sheet1;
			Login.run(1);
			Navigate_More.run(1);
			ReconcilewithGeneralLedgerITC.run(1);
		}
		@AfterTest
		public void end(){
			//close();
		}

	}
