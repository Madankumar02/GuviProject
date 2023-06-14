package pagecomponent;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class SelectingBrand extends WebUtil {

	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement us;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement hamburgermenu;
	
	@FindBy(xpath="(//button[@class=\"c-button-unstyled top-four v-fw-medium\"])[3]")
	WebElement Brands;
	
	@FindBy(xpath="(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
	WebElement Sony;
	
	@FindBy(linkText="Sony home audio")
	WebElement sonyhomeaudio;
	
	@FindBy(xpath="(//button[@class=\"c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button\"])[1]")
	WebElement addtocart;
	
	public SelectingBrand() {
		PageFactory.initElements(WebUtil.driver, this);
	}
	
	public void ShopByBrand() {
		
		try {
			ClickingEle(us);
			Expliwait(hamburgermenu,2);
			ClickingEle(hamburgermenu);
			Expliwait(Brands,2);
			ClickingEle(Brands);
			Expliwait(Sony,2);
			ClickingEle(Sony);
			Expliwait(sonyhomeaudio,2);
			ClickingEle(sonyhomeaudio);
			Expliwait(addtocart,2);
			ClickingEle(addtocart);
			//test.log(Status.PASS, "ShopByBrand successfull");
		} catch (Exception e) {
			//test.log(Status.FAIL, "Issue in ShopByBrand");
			e.printStackTrace();
		}
	}
	

}

