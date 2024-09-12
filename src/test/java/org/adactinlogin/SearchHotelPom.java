package org.adactinlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClasses;

public class SearchHotelPom extends BaseClasses {
	public SearchHotelPom() {
		PageFactory.initElements(driver ,this);
		
	}
	
	@FindBy(name="username_show")
	private WebElement UserProfile;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement BookedItinerary;
	
	@FindBy (name="location")
	private WebElement Location;
	
	@FindBy (id ="hotels")
	private WebElement Hotels;
	
	@FindBy (id ="room_type")
	private WebElement RoomType;
	
	@FindBy (id ="room_nos")
	private WebElement NoOfRooms;
	
	@FindBy (id ="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy (id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy (id="adult_room")
	private WebElement AdultsCount;
	
	@FindBy (id="child_room")
	private WebElement ChildCount;
	
	@FindBy (id="Submit")
	private WebElement Search;
	
	@FindBy (id="Reset")
	private WebElement Reset;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsCount() {
		return AdultsCount;
	}

	public WebElement getChildCount() {
		return ChildCount;
	}
	
	public WebElement getUserProfile() {
		return UserProfile;
	}

	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getReset() {
		return Reset;
	}
	
	

}
