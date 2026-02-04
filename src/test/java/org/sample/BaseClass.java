package org.sample;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
	   driver = new ChromeDriver();
	   return driver;
	   
	}
	public static void urlLaunch(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));

	}
	
	public static void sendKeys(WebElement e,String value) {
		e.clear();
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
      e.click();
	}
	
	
	public static String getCurrentUrl() {
     String url = driver.getCurrentUrl();
     return url;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	
	public static void selectByVisibleText(WebElement e, String value) {
		Select s= new Select(e);
		s.selectByVisibleText(value);
	}
	
	
	public static String getAttribute(WebElement e , String value) {
		e.getAttribute(value);
		return e.getAttribute(value);
	}
	
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void dragAndDrop(WebElement src,WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).perform();
	}
	
	public static void selectByIndex(WebElement e,int index) {
		Select s =new Select(e);
		s.selectByIndex(index);
	}
	
	public static void selectByvisibleText(WebElement e,String value) {
		Select s =new Select(e);
		s.selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement e,String value) {
		Select s =new Select(e);
		s.selectByValue(value);
	}
	
	public static void alertOk() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void switchToWindow(int index) {
		Set<String> all = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(all);
		driver.switchTo().window(li.get(index));

	}
	
	public static void launchBrowser(String bname) {
		switch(bname) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
		    driver=new EdgeDriver();
		    break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			driver=new ChromeDriver();
				
		}

	}
	
	public static WebDriver lanuchBrowser(String bname) {
		if(bname.equals("chrome"))  {
			driver=new ChromeDriver();
		}
		else if(bname.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(bname.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		return driver;

	}
	
	
//====================================================================================
	                            //practice
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static void clickEnter() throws AWTException {
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
	}
	
	public static void scrollToElement(WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).perform();
	}
	
	public static void scrollToElement(By locator) {
		WebElement e = driver.findElement(locator);
		new Actions(driver).moveToElement(e).perform();
	}

	
	public static void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrameByNameorId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public static void switchToFrameByElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	
	public static void alertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void getalertText() {
		Alert a = driver.switchTo().alert();
		a.getText();
	}
	
	public static void sendKeysToalert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}
	
	
	
	public static void rightClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}
	
	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}
	
	public static void WindowHandle(int index) {
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(handles);
		list.addAll(handles);
		driver.switchTo().window(list.get(index));
	}
	
	
	//WebTable
//	public static int getRowcount() {
//	   return driver.findElement(By.xpath(tableXPath + "//tr")).size();
//	}
//		
//	public static int getColumnCount() {
//	   return driver.findElement(By.xpath(tableXPath + "//tr[1]/td")).size();
//	}
	
	
	
	
}

