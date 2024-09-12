package org.adactinlogin;
import org.junit.*;
import org.utility.BaseClasses;

public class AdactiontestLogin extends BaseClasses {

    @BeforeClass
    public static void beforeclass() {
        System.out.print("Booking Begins");
        
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
        System.out.println("Booking Successful");
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
        
//        System.out.println("Test 1 Passes");
        
    }

    @Test
    public void test2() throws InterruptedException {
    	
//    	System.out.println("test 2 begins");
    	
    	explicitwait(10);
    	
        SearchHotelPom sp = new SearchHotelPom();
        
        sendKeys(sp.getLocation(), "London");
        
        Assert.assertEquals(getAttributs(sp.getLocation()),"London");
        
//        SelectByIndex(sp.getLocation(),1);

//        SelectByVisisbleText(sp.getLocation(), "London");

        SelectByVisisbleText(sp.getHotels(), "Hotel Sunshine");
        
        Assert.assertEquals(getAttributs(sp.getHotels()),"Hotel Sunshine");


        SelectByVisisbleText(sp.getRoomType(), "Deluxe");
        
        Assert.assertEquals(getAttributs(sp.getRoomType()),"Deluxe");
        

        SelectByVAluee(sp.getNoOfRooms(),"2");
        
        Assert.assertEquals("Selected No of Rooms are mismatched",getAttributs(sp.getNoOfRooms()),"2");
        
        sp.getCheckInDate().clear();    

        sendKeys(sp.getCheckInDate(), "18/09/2024");
        
        Assert.assertEquals(getAttributs(sp.getCheckInDate()),"18/09/2024");
        
        sp.getCheckOutDate().clear();

        sendKeys(sp.getCheckOutDate(), "20/09/2024");
        
        Assert.assertEquals(getAttributs(sp.getCheckOutDate()),"20/09/2024");

        SelectByVAluee(sp.getAdultsCount(), "2");
        
        Assert.assertEquals("No.of Adults ?",getAttributs(sp.getNoOfRooms()),"2");

        SelectByVAluee(sp.getChildCount(),"0");
        
        Assert.assertEquals("No.of Child ?",getAttributs(sp.getChildCount()),"0");

        click(sp.getSearch());

        String url1 = getCurrentUrll();

        System.out.println(url1);

        Assert.assertTrue("Url is Correct",url1.contains("SelectHotel.php"));
    }

    @Test
    public void test3() {
    	
    	
        SelectHotelPom sh = new SelectHotelPom();

        click(sh.getRadioBtn());
        
        click(sh.getContinue());

        String url2 = getCurrentUrll();

        System.out.println(url2);

        Assert.assertEquals("Url is Correct", url2, "https://adactinhotelapp.com/HotelAppBuild2/BookHotel.php");
    }
    @Test
    public void test4() throws InterruptedException {
    	
    	BookHotelpom b = new BookHotelpom();
    	
    	sendKeys(b.getFirstName(),"Janani");
    	
    	Assert.assertEquals(getAttributs(b.getFirstName()), "Janani");
    	
    	sendKeys(b.getLastName(),"Aravinth");
    	
    	Assert.assertEquals(getAttributs(b.getLastName()), "Aravinth");
    	
    	sendKeys(b.getAddress(),"251-c,savadi street, namakkal");
    	
    	Assert.assertEquals(getAttributs(b.getAddress()), "251-c,savadi street, namakkal");
    	
    	sendKeys(b.getCreditNum(),"8764322459876543");
    	
    	Assert.assertEquals(getAttributs(b.getCreditNum()), "8764322459876543");
    	
    	sendKeys(b.getCreditType(),"VISA");
    	
    	Assert.assertEquals(getAttributs(b.getCreditType()), "VISA");
    	
    	SelectByVAluee(b.getExpirymonth(),"1");
    	
    	Assert.assertEquals(getAttributs(b.getExpirymonth()), "1");
    	
    	SelectByVisisbleText(b.getExpiryYear(),"2025");
    	
    	Assert.assertEquals(getAttributs(b.getExpiryYear()), "2025");
    	
    	sendKeys(b.getCVVNum(),"6754");
    	
    	Assert.assertEquals(getAttributs(b.getCVVNum()), "6754");
    	
    	click(b.getBookNow());
    	
    	explicitwait(20);
    	
    	String OrderNo = getAttributs(b.getorderno());
    	
    	System.out.println("Order Id is "+ OrderNo);
    	
        String url3 = getCurrentUrll();
        
        
        System.out.println(url3);

    	
        Assert.assertTrue("Url is Correct", url3.contains("BookingConfirm"));
              

    	    }
    @Test
    
    public void test5() {
    	
    	BookingConfirm log = new BookingConfirm();
    	
    	click(log.getLogOut());
    }
    
    
}
