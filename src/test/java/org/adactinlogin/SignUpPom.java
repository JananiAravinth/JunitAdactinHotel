package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class SignUpPom extends BaseClasses{
	
	public SignUpPom() {
		PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy (id="username")
	private WebElement Username;
	
	@FindBy (id="password")
	private WebElement Password;
	
	@FindBy (id="re_password")
	private WebElement ConfirmPassword;
	
	
	@FindBy (id="full_name")
	private WebElement FullName;
	
	@FindBy (id="email_add")
	private WebElement EmailId;

	@FindBy (id="captcha-form")
	private WebElement CaptchaText;
	
	@FindBy (id="tnc_box")
	private WebElement TermsCheckBox;
	
	@FindBy (id="Submit")
	private WebElement Register;
	
	@FindBy (id="Reset")
	private WebElement Reset;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getFullName() {
		return FullName;
	}

	public WebElement getEmailId() {
		return EmailId;
	}

	public WebElement getCaptchaText() {
		return CaptchaText;
	}

	public WebElement getTermsCheckBox() {
		return TermsCheckBox;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getReset() {
		return Reset;
	}
	
	
	
}
