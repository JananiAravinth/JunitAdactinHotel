package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class BookHotelpom extends BaseClasses{
	
	public BookHotelpom() {
	
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[text()='Back']")
	private WebElement Back;
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement CreditNum;
	
	@FindBy(id="cc_type")
	private WebElement CreditType;
	
	@FindBy(id="cc_exp_month")
	private WebElement Expirymonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNum;
	
	@FindBy(name="order_no")
	private WebElement orderno;
	
	@FindBy(id="book_now")
	private WebElement BookNow;
	
	@FindBy(id="cancel")
	private WebElement cancel;

	public WebElement getBack() {
		return Back;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditNum() {
		return CreditNum;
	}

	public WebElement getCreditType() {
		return CreditType;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVVNum() {
		return CVVNum;
	}
	public WebElement getorderno() {
		return orderno;
		
	}

	public WebElement getBookNow() {
		return BookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
	
	

}
