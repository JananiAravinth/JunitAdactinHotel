package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class BookedItineraryPom extends BaseClasses{
	
	public  BookedItineraryPom(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "order_id_text")
    private WebElement searchOrderId;
	
	@FindBy(id = "search_hotel_id")
    private WebElement searchButton;
	
	@FindBy(xpath = "//input[@name='ids[]']")
    private WebElement bookingCheckbox;
	
	 @FindBy(xpath = "//input[@value='Cancel Selected']")
	 private WebElement cancelSelectedButton;
	 
	 @FindBy(xpath="//label[@id='search_result_error']")
	 private WebElement CancelledError;
	 
	public WebElement getCancelledError() {
		return CancelledError;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBookingCheckbox() {
		return bookingCheckbox;
	}

	public WebElement getCancelSelectedButton() {
		return cancelSelectedButton;
	}
	 
	 
	
}
