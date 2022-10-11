package pom.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_EmailId;
	
	
	@FindBy(how= How.XPATH,using = "//input[@type='password']")
	private WebElement txt_pass;
	
	
	@FindBy(how=How.XPATH,using="//input[@//button[@name='login']']")
	private WebElement btn_login;


	public WebElement getTxt_EmailId() {
		return txt_EmailId;
	}


	

	public WebElement getTxt_pass() {
		return txt_pass;
	}


	


	public WebElement getBtn_login() {
		return btn_login;
	}


	
	
	
	
	
	

}
