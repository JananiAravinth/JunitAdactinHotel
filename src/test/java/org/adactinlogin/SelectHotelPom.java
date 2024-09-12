package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class SelectHotelPom extends BaseClasses {
	public SelectHotelPom() {
		PageFactory.initElements(driver, this);
	
	
	}
	@FindBy(id="radiobutton_0")
	private WebElement RadioBtn;
	
	@FindBy(id="continue")
	private WebElement Continue;

	@FindBy(id="cancel")
	private WebElement Cancel;

	public WebElement getRadioBtn() {
		return RadioBtn;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
		

}
