package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class BookingConfirm extends BaseClasses {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="search_hotel")
	private WebElement SearchHotel;
	
	@FindBy(id="my_itinerary")
	private WebElement MyItinerary;
	
	@FindBy (id="logout")
	private WebElement LogOut;

	public WebElement getSearchHotel() {
		return SearchHotel;
	}

	public WebElement getMyItinerary() {
		return MyItinerary;
	}

	public WebElement getLogOut() {
		return LogOut;
	}
	
	
	
	

}
