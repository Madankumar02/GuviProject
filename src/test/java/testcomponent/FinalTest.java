package testcomponent;

import org.testng.annotations.Test;

import enginecomponent.Base;
import pagecomponent.LoginPage;
import pagecomponent.SelectingBrand;
import pagecomponent.SelectingDepartment;
import pagecomponent.SigninginPage;

public class FinalTest extends Base {
	
	@Test
	public void execution01() throws InterruptedException {
		
		
		LoginPage obj = new LoginPage();
		obj.CurrentCredentials();
		
	}
		
	@Test
		public void execution02() throws InterruptedException {
			LoginPage obj = new LoginPage();
			obj.InvalidCredentials();
		}
		
		@Test
	public void execution03() {
	
	SigninginPage obj = new SigninginPage();
	obj.downpagechecking();
	
	}
		@Test
		public void execution04() { 
			
			SelectingBrand obj = new SelectingBrand();
			obj.ShopByBrand();
			
			}
		@Test
			public void execution05() { 
			
				SelectingDepartment obj = new SelectingDepartment();
			obj.ShopByDept();
			}
		
	}


