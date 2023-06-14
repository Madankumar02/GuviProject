package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;



import utility.WebUtil;

public class LoginPage extends WebUtil {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@FindBy(xpath = "(//a[@class='us-link'])[1]")
		WebElement UnitedStates;

		@FindBy(xpath = "//span[text()='Account']")
		WebElement Mainaccount;

		@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
		WebElement Signinginpage;

		@FindBy(xpath = "//input[@type='email']")
		WebElement Accountusername;

		@FindBy(xpath = "//input[@type='password']")
		WebElement Userpassword;

		@FindBy(xpath = "//button[@class=\"c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit \"]")
		WebElement Submit;

		

		public LoginPage() {
			PageFactory.initElements(WebUtil.driver, this);
		}

		public void CurrentCredentials() throws InterruptedException {
			try {
				Expliwait(UnitedStates, 2);
				ClickingEle(UnitedStates);
				Expliwait(Mainaccount, 2);
				ClickingEle(Mainaccount);
				Expliwait(Signinginpage, 2);
				ClickingEle(Signinginpage);
				sendkeysMethod(Accountusername, "smadankumar11@gmail.com");
				sendkeysMethod(Userpassword, "Maddy@8844*");
				ClickingEle(Submit);
				
			test.log(Status.PASS, "Signin Successful");
			} catch (Exception e) {
				test.log(Status.FAIL, "Signin Failed");
				e.printStackTrace();
			}
		}

		public void InvalidCredentials() throws InterruptedException {

			try {
				ClickingEle(UnitedStates);
				Expliwait(Mainaccount, 2);
				ClickingEle(Mainaccount);
				Expliwait(Signinginpage, 2);
				ClickingEle(Signinginpage);
				sendkeysMethod(Accountusername, "abcd@gmail.com");
				sendkeysMethod(Userpassword, "MAddy@8844*");
				ClickingEle(Submit);
				test.log(Status.PASS, "Signin with incorrect credentials successfull");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in signin up with incorrect credentials");
				e.printStackTrace();
			}
		}

	}


