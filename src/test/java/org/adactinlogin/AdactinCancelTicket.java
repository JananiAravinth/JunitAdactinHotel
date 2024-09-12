package org.adactinlogin;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClasses;

public class AdactinCancelTicket extends BaseClasses{
	
	@BeforeClass
	
	public static void beforeclass() {
		
		System.out.println("Booking Cancel Process");

        BrowserLaunch("Chrome");

        urlLaunch("https://adactinhotelapp.com/HotelAppBuild2/");

        implicitlywaitt(10);
		
	}
	 @Before
	    public void before() throws InterruptedException {
	    	explicitwait(10);
	    }
	
	@AfterClass
	
	public static void afterclass() {
		 System.out.println("Booking Cancelled");
	        quit();

	}
	@Test
	
	public void test1() {
		LoginPagePom l = new LoginPagePom();

        sendKeys(l.getUsername(), "JananiAr");
        
        String username = getAttributs(l.getUsername());
        
        Assert.assertEquals("Username is Mismatched",username, "JananiAr");
        
        sendKeys(l.getPassword(), "8667247297");
        
        Assert.assertEquals("Password is Incorrect",getAttributs(l.getPassword()),"8667247297");

        click(l.getLoginbtn());

        String url = getCurrentUrll();

        System.out.println(url);

        Assert.assertTrue("Url is inCorrect", url.contains("SearchHotel"));
		
	}
	
	@Test 
	public void test2() {
	
	SearchHotelPom sh = new SearchHotelPom();
	
	BookHotelpom bk = new BookHotelpom();
	
	click(sh.getBookedItinerary());
	
	BookedItineraryPom bi = new BookedItineraryPom();
	
	List<WebElement> cancelOptions = driver.findElements(By.xpath("//input[@type='button']"));
	WebElement Cancelbtn = cancelOptions.get(cancelOptions.size()-3);
	click(Cancelbtn);
	
//	sendKeys(bi.getSearchOrderId(),"ILUBZ8B79U");
	
//	click(bi.getBookingCheckbox());
	
//    click(bi.getCancelSelectedButton());
    
    Alert a = driver.switchTo().alert();
    a.accept();
    
//   String cancelledError = bi.getCancelledError().toString();
// 
//    Assert.assertEquals("Booking cancellation failed!",cancelledError.contains("The booking has been cancelled."));

//   Assert.assertEquals("Booking cancellation failed!", bi.getCancelledError().getText().contains("The booking has been cancelled."),"The booking has been cancelled.");

    

	
	}

}
