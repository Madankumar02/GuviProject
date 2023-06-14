package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class SelectingDepartment extends WebUtil {

		@FindBy(xpath="(//a[@class='us-link'])[1]")
		WebElement us;

		@FindBy(xpath = "(//button[@type='button'])[2]")
		WebElement hamburgermenu;

		@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[3]")
		WebElement ComputerTables;

		@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[7]")
		WebElement ComputerAccessories;

		@FindBy(xpath = "(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
		WebElement Webcams;

		@FindBy(xpath = "(//button[@type='button'])[33]")
		WebElement AddtoCart;

		public SelectingDepartment() {
			PageFactory.initElements(WebUtil.driver, this);
		}

		public void ShopByDept() {
			try {
				Expliwait(us,2);
				ClickingEle(us);
				Expliwait(hamburgermenu,2);
				ClickingEle(hamburgermenu);
				//expWait(ComputerTables,2);
				ClickingEle(ComputerTables);
				Expliwait(ComputerAccessories,2);
				ClickingEle(ComputerAccessories);
				Expliwait(Webcams,2);
				ClickingEle(Webcams);
				Expliwait(AddtoCart,2);
				ClickingEle(AddtoCart);
				//test.log(Status.PASS, "Adding item in ShopByDept is successful");
				
			} catch (Exception e) {
				//test.log(Status.FAIL, "Issue in Adding item in ShopByDept");
				e.printStackTrace();
			}
		}
		
	}

