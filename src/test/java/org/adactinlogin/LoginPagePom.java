package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class LoginPagePom extends BaseClasses{
	public LoginPagePom() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (id ="username")
	private WebElement Username;
	
	@FindBy (id ="password")
	private WebElement Password;
	
	@FindBy (id = "login")
	private WebElement Loginbtn;
	
	@FindBy (xpath="//a[text()='New User Register Here']")
	private WebElement NewUser;
	
	@FindBy (xpath="//a[text()='Forgot Password?']")
	private WebElement ForgotPassword;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getNewUser() {
		return NewUser;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
	
	

}
