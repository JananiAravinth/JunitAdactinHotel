package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses  {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static Select s;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;
	
	public static void BrowserLaunch(String Browsername) {
		
		if(Browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		else if (Browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();		
		}
		
		else if(Browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
			}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	
	public static void implicitlywaitt(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);	
	}
	
	public  static void explicitwait(long args) throws InterruptedException {
		Thread.sleep(args);
	}
	
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static String getTitlee() {
		return driver.getTitle();
		 
	}
	public static String getCurrentUrll() {
		return driver.getCurrentUrl();
	}
	
	public static  String getTextt(WebElement e) {
		return e.getText();

	}
	public static String getAttributs(WebElement e) {
		return e.getAttribute("value");

	}

	public static void moveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
			

	}
	
	public static void dragAndDropp(WebElement src, WebElement target ) {
		a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	public static void contextClick(WebElement target) {
		a = new Actions(driver);
		a.click(target).perform();

	}
	
	public static void doubleClickk() {
		a = new Actions(driver);
		a.doubleClick().perform();

	}
	public static void clickAndHold() {
		a = new Actions(driver);
		a.clickAndHold().perform();
		
	}
	
	public static void keyPress(int event) throws AWTException {
		r = new Robot();
		r.keyPress(event);
		
	}
	public static void keyRelease(int event) throws AWTException {
		r = new Robot();
		r.keyRelease(event);
				
	}
	public static void keyUp(WebElement e ,CharSequence key ) {
		a.keyUp(e,key).perform();
	}
	
	public static void keyDown(WebElement e ,CharSequence key ) {
		a.keyDown(e, key).perform();
	}
	public static void simpleAlert() {
		al = driver.switchTo().alert();
		boolean acceptAlert = false;
		if(acceptAlert==true) {
		al.accept();
		}
		else 
		{
			al.dismiss();
		}}
	public static String COnfirmAlert(){
		al = driver.switchTo().alert();
		boolean ac = false;
		if(ac == true) {
			al.accept();
		}
		else {
			al.dismiss();
		}
		
		return al.getText();

	}
		public static void promptAlert(String args) {
			al = driver.switchTo().alert();
			al.sendKeys(args);
			al.accept();

		}
		public static void SelectByVAluee(WebElement e,String value) {
			s  = new Select(e);
			s.selectByValue(value);
		}
		public static void SelectByIndex(WebElement e, int index) {
			s = new Select(e);
			s.selectByIndex(index);
		}
		public static void SelectByVisisbleText(WebElement e ,String v ) {
			s = new Select(e);
			s.selectByVisibleText(v);
		}

		public static String getOptions(WebElement e) {
			s = new Select(e);
			
			List<WebElement> op =  s.getOptions();
			String options = null;
			for(int i=0;i<op.size();i++) {
				WebElement w = op.get(i);
				options =  w.getText();
			}
			return options;

		}
		public static String getAllSelectedOptions(WebElement e) {
			s = new Select(e);
			
			List<WebElement> op =s.getAllSelectedOptions();
			String options = null;
			for(int i=0;i<op.size();i++) {
				WebElement w = op.get(i);
				options =  w.getText();
			}
			return options;

		}
		public static String getFirstSelectedOptions(WebElement e) {
			s = new Select(e);
			
			WebElement op =s.getFirstSelectedOption();
			String option = op.getText();			
			return option;

		}
		
		public static Boolean isMultitple(WebElement e) {
			s = new Select(e);
			boolean ismultiple = s.isMultiple();
			return ismultiple;

		}
		public static void deSelectByVAluee(WebElement e,String value) {
			s  = new Select(e);
			s.deselectByValue(value);
		}
		public static void deSelectByIndex(WebElement e, int index) {
			s = new Select(e);
			s.deselectByIndex(index);
		}
		public static void deSelectByVisisbleText(WebElement e ,String v ) {
			s = new Select(e);
			s.deselectByVisibleText(v);
		}
		
		public static void deselectAll(WebElement e) {
			s= new Select(e);
			s.deselectAll();
		}
		
		public static void selectAllByIndex(WebElement e) {
			s = new Select(e);
			
			List<WebElement> op =s.getOptions();
			for(int i=0;i<op.size();i++) {
				s.selectByIndex(i);
			}
		}
		public static void selectAllByValue(WebElement e) {
			s = new Select(e);
			
			List<WebElement> op =s.getOptions();
			for(int i=0;i<op.size();i++) {
				WebElement w = op.get(i);
				String Attribte = w.getAttribute("value");
				s.selectByValue(Attribte);
			}
		
		}
		public static void selectAllByVisibleText(WebElement e) {
			s = new Select(e);
			
			List<WebElement> op =s.getOptions();
			for(int i=0;i<op.size();i++) {
				WebElement w = op.get(i);
				String text = w.getText();
				s.selectByVisibleText(text);
			}
		}
		
		public static void TakesScreenShot(String filename) throws IOException {
			tk=(TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File des = new File(System.getProperty("user.dir")+"src\\test\\resources\\Screenshots"
					+filename+"_"+System.currentTimeMillis()+".png");
			FileUtils.copyFile(src, des);
			
			}
		
		public static void JavaScriptExecutorSetAttribute(String Attributevalue, WebElement e) {
			js = (JavascriptExecutor)driver;
//		    String script = "arguments[0].setAttribute('value','Attributevalue')";
			 js.executeScript("arguments[0].setAttribute('value','"+Attributevalue+"')",e);
			
				}		
		public static String JavascriptExecutorGetAttribute(WebElement e) {
			js = (JavascriptExecutor)driver;
		    String string = js.executeScript("return arguments[0].getAttribute('value')",e).toString();
		    return string;
		    

		}
		public static void ScrollDown(WebElement e) {
			js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",e);
						
		}
		public static void ScrollUp(WebElement e) {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false);",e);

		}
		public static void navigateTo(String url) {
			driver.navigate().to(url);

		}
		public static void backward() {
			driver.navigate().back();
		}
		public static void forward() {
			driver.navigate().forward();
		}
		public static void refresh() {
			driver.navigate().refresh();
		}
		public static void FrameIdOrName(String name) {
			driver.switchTo().frame(name);
		}
		public static void FrameWebElement(WebElement e) {
			driver.switchTo().frame(e);
		}
		public static void FrameIndex(int index) {
			driver.switchTo().frame(index);
		}
		public static void ParentFrame() {
			driver.switchTo().parentFrame();
			
		}
		public static void DefaultContent() {
			driver.switchTo().defaultContent();
		}
		public static void WindowsHandling1() {
			String parentId = driver.getWindowHandle();
			Set<String> AllId = driver.getWindowHandles();
			for(String eachId:AllId) {
				if(!parentId.equals(eachId)) {
					driver.switchTo().window(eachId);
				}
			}
		}
		public static void WindowsHandling2(int win) {
			Set<String> AllId = driver.getWindowHandles();
			int count =1;
			for (String eachId:AllId) {
				if(count == win) {
					driver.switchTo().window(eachId);
				}
				count++;
			}
				
		}
		public static void windowsHandling3(int index) {
			Set<String> AllId = driver.getWindowHandles();

			List<String> l = new ArrayList();
			l.addAll(AllId);
//			String s = l.get(index);
//			driver.switchTo().window(s);
			
			driver.switchTo().window(l.get(index));
		}
		public static void close() {
			driver.close();

		}
		public static void quit() {
			driver.quit();
		}
			
		
		
}
