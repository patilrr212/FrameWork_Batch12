         package pom.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utility.baseclass;
import com.utility.library;

import pom.pageobject.loginPom;

public class Test_tc001 extends baseclass{
	
	@Test
	public void verify_TestLogin_validCredential() {
		loginPom Login=PageFactory.initElements(driver, loginPom.class);
		library.custom_sendkeys(Login.getTxt_EmailId(),excel.getStringData("Sheet1,0,0));
		library.custom_sendkeys(Login.getTxt_pass(), "385858");

		library.custom_click(Login.getBtn_login());
	
	library.custom_handledropdown(null, null);
	library.custom_handledropdown(null, null);
	}

}
