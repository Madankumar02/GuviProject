package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class MenuOptions extends WebUtil {
	
	@FindBy(xpath="(//a[@class=\"us-link\"])[1]")
	WebElement UnitedStates;
	
	@FindBy(xpath="//a[text()=\"Top Deals\"]")
	WebElement deals;
	
	@FindBy(xpath="//a[text()=\"Deal of the Day\"]")
	WebElement DealDay;
	
	@FindBy(xpath="//a[text()=\"Totaltech Membership\"]")
	WebElement Membership;
	
	@FindBy(xpath="//a[text()=\"Credit Cards\"]")
	WebElement cardOffers;
	
	@FindBy(xpath="//a[text()=\"Gift Cards\"]")
	WebElement Gifts;
	
	@FindBy(xpath="//a[text()=\"Gift Ideas\"]")
	WebElement Ideas;
	
	@FindBy(xpath="//a[text()=\"Health & Wellness\"]")
	WebElement Health;
	
	@FindBy(xpath="//a[text()='Best Buy Outlet']")
	WebElement Outlet;
	
	@FindBy(xpath="//span[@class=\"v-p-right-xxs utility-nav-drawer-btn-label\"]")
	WebElement moreoption;
	
	@FindBy(xpath="//a[@class=\"utility-menu-flyout-list-item\"]")
	WebElement Business;
	
	@FindBy(xpath="//button[@class=\"c-button-link menuCloseBtn accountMenuCloseButton\"]")
	WebElement close;
	
	public MenuOptions() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void MenuDeals() throws InterruptedException {
		try {
			ClickingEle(UnitedStates);
			Expliwait(deals,2);
			ClickingEle(deals);
			String title =driver.getTitle();
			Assert.assertEquals(title, "Top Deals and Featured Offers on Electronics - Best Buy");
			test.log(Status.PASS, "TopDeals Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating TopDeals title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(DealDay);
			String title1 =driver.getTitle();
			Assert.assertEquals(title1, "Deal of the Day: Electronics Deals - Best Buy");
			test.log(Status.PASS, "Dealoftheday Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Dealoftheday title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(Membership);
			String title2 =driver.getTitle();
			Assert.assertEquals(title2, "Best Buy Totaltech™ – Best Buy");
			test.log(Status.PASS, "Totaltech Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Totaltech title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(cardOffers);
			String title3 =driver.getTitle();
			Assert.assertEquals(title3, "Best Buy Credit Card: Rewards & Financing");
			test.log(Status.PASS, "Creditcards Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Creditcards title");
			e.printStackTrace();
		}
  
		try {
			ClickingEle(Gifts);
			String title4 =driver.getTitle();
			Assert.assertEquals(title4, "Gifts Cards and E-Gift Cards - Best Buy");
			test.log(Status.PASS, "GiftCards Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftCards title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(Ideas);
			String title5 =driver.getTitle();
			Assert.assertEquals(title5, "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			test.log(Status.PASS, "GiftIdeas Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftIdeas title");
			e.printStackTrace();
		}
		try {
			ClickingEle(Health);
			String title6 =driver.getTitle();
			Assert.assertEquals(title6, "Health & Wellness Solutions & Technology - Best Buy");
			test.log(Status.PASS, "HealthWellness Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating HealthWellness title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(Outlet);
			String title7 = driver.getTitle();
			Assert.assertEquals(title7, "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			test.log(Status.PASS, "BestBuyOutlet Title validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating BestBuyOutlet title");
			e.printStackTrace();
		}
		
		try {
			ClickingEle(moreoption);
			Expliwait(Business,2);
			ClickingEle(Business);
			String title8 = driver.getTitle();
			Assert.assertEquals(title8, "Best Buy for Business - Best Buy");
			test.log(Status.PASS, "Best Buy for Business validated");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Best Buy for Business validated title");
			e.printStackTrace();
		}

	}}
