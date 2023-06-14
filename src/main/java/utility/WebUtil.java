package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtil extends FileUtil {
	
public static WebDriver driver;
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public static void startReport() {
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/AutomationTestReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
	}

	public static void stopReport() {
		reports.flush();
	}
	
	
	
	public static boolean browser(String name) {
		boolean flag = false;

		try {
			switch (name) {

			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				flag = true;
				//test.log(Status.PASS, "Chrome Browser Launched Successfully.");
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				flag = true;
				//test.log(Status.PASS, "Edge Browser Launched Successfully");
				break;
			case "FireFox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				flag = true;
				//test.log(Status.PASS, "Firefox Browser Launched Successfully.");
				break;
			case "Safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				flag = true;
				//test.log(Status.PASS, "Safari Browser Launched Successfully.");
				break;
			}
		} catch (Exception e) {
			//test.log(Status.FAIL, "Lauching Browser was failed." + e.getMessage());
		}
		return flag;

	}

	public void PageLaunch(String Weblink) {
		try {
			driver.get(Weblink);
			//test.log(Status.PASS, "PageLaunch is Successfully opened");
		} catch (Exception e) {
			//test.log(Status.FAIL, "PageLaunch is Failed");
			e.printStackTrace();
		}
	}

	public void WebpageMaxi() {
		try {
			driver.manage().window().maximize();
			//test.log(Status.PASS, "WebpageMaxi is Successfully Maximized");
		} catch (Exception e) {
			//test.log(Status.FAIL, "WebpageMaxi is Not Maximized");
			e.printStackTrace();
		}
	}

	public void Impliwait () {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//test.log(Status.PASS, "Impliwait is Passed");
		} catch (Exception e) {
			//test.log(Status.FAIL, "Impliwait is Failed");
			e.printStackTrace();
		}
	}

	public void Expliwait(WebElement ele, int timer) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timer));
			wait.until(ExpectedConditions.visibilityOf(ele));
			//test.log(Status.PASS, "Expliwait is Passed");
		} catch (Exception e) {
			//test.log(Status.FAIL, "Expliwait is Failed");
			e.printStackTrace();
		}

	}

	public void ClickingEle(WebElement ele) {
		try {
			ele.click();
			//test.log(Status.PASS, "ClickingEle is clicked Successful");
		} catch (Exception e) {
			//test.log(Status.FAIL, "ClickingEle is Failed");
			e.printStackTrace();
		}

	}

	public void sendkeysMethod(WebElement ele, String value) {
		try {
			ele.sendKeys(value);
			//test.log(Status.PASS, "sendkeysMethod is Successful");
		} catch (Exception e) {
			//test.log(Status.FAIL, "sendkeysMethod is Failed");
			e.printStackTrace();
		}
	
		
	}
	
	public void navigatebackward() {
		try {
			driver.navigate().back();
			//test.log(Status.PASS, "navigatebackward is done Successful");
		} catch (Exception e) {
			//test.log(Status.FAIL, "navigatebackward Failed");
			e.printStackTrace();
		}
	
	}
	

	public void WebpageClose() {
		try {
			driver.close();
			//test.log(Status.PASS, "WebpageClose is Closed Successful");
		} catch (Exception e) {
			//test.log(Status.FAIL, "WebpageClose is Failed");
			e.printStackTrace();
		}
	}
	
	

}
