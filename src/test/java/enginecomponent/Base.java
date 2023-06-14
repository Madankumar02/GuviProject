package enginecomponent;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utility.WebUtil;
	
	public class Base extends WebUtil{
		@BeforeSuite
	public void beforesuite() {
		startReport();
	}
	
		@BeforeMethod(alwaysRun=true)
		public void beforeTest() throws IOException {
			
			test = reports.createTest("Testcase");
			browser(readProperty("browser"));
			WebpageMaxi();
			Impliwait();
			PageLaunch(readProperty("url"));
			
		}
		@AfterMethod(alwaysRun=true)
		public void afterTest() {
			WebpageClose();	
		}
	
	  
		@AfterSuite
	public void afterSuite() {
		stopReport();
	}
	}


