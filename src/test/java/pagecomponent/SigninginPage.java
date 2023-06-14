package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class SigninginPage extends WebUtil {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement UnitedStates;
	
	@FindBy(xpath = "//a[@class='body-copy-sm mr-200']")
	WebElement Access;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[2]")
	WebElement TermsandCond;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[3]")
	WebElement privacyrights;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[4]")
	WebElement BasedAd;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[5]")
	WebElement StaPrivacy;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[6]")
	WebElement Personalinfo;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[7]")
	WebElement LimitUSe;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[8]")
	WebElement OptOut;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[9]")
	WebElement TransparencyAct;

	public SigninginPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}
	

		public void downpagechecking() {
			try {
				ClickingEle(UnitedStates);
				Expliwait(Access,5);
				ClickingEle(Access);
				driver.getTitle();
				String title =driver.getTitle();
				System.out.println(title);
				test.log(Status.PASS, "Accessibility title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating Accessibility title");
				e.printStackTrace();
			}
			
			try {
				Expliwait(TermsandCond, 5);
				ClickingEle(TermsandCond);
				String title1 =driver.getTitle();
				System.out.println(title1);
				test.log(Status.PASS, "TermsandConditions title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TermsandConditions title");
				e.printStackTrace();
			}
			
			try {
				Expliwait(privacyrights, 2);
				ClickingEle(privacyrights);
				String title2 =driver.getTitle();
				System.out.println(title2);
				test.log(Status.PASS, "privacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating privacy title");
				e.printStackTrace();
			}
			
			try {
				Expliwait(BasedAd, 2);
				ClickingEle(BasedAd);
				String title3 =driver.getTitle();
				System.out.println(title3);
				test.log(Status.PASS, "InterestBasedAd title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating InterestBasedAd title");
				e.printStackTrace();
			}
			
			try {
				Expliwait(StaPrivacy, 2);
				ClickingEle(StaPrivacy);
				String title4 =driver.getTitle();
				System.out.println(title4);
				test.log(Status.PASS, "StatePrivacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating StatePrivacy title");
				e.printStackTrace();
			}
			
			try {
				Expliwait(Personalinfo, 2);
				ClickingEle(Personalinfo);
				String title5 =driver.getTitle();
				System.out.println(title5);

				test.log(Status.PASS, "CA title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CA title");
				e.printStackTrace();
			}
			
			navigatebackward();
			
		
			try {
				Expliwait(LimitUSe, 2);
				ClickingEle(LimitUSe);
				String title6 =driver.getTitle();
				System.out.println(title6);
				test.log(Status.PASS, "LimitUSe title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating LimitUSe title");
				e.printStackTrace();
			}
			navigatebackward();
			
			
			try {
				Expliwait(OptOut, 2);
				ClickingEle(OptOut);
				String title7 =driver.getTitle();
				System.out.println(title7);
				test.log(Status.PASS, "TargetedAdv title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TargetedAdv title");
				e.printStackTrace();
			}
			navigatebackward();
			
			try {
				Expliwait(TransparencyAct, 2);
				ClickingEle(TransparencyAct);
				String title8 =driver.getTitle();
				System.out.println(title8);
				test.log(Status.PASS, "CASupplyChain title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CASupplyChain title");
				e.printStackTrace();
			}
	}

}
