package org.sample;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;
import org.testtt.HotelCode;

public class LoginPage1 extends BaseClass{
	
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtusername1;

	@FindBy(id="pass")	
	private WebElement txtpassword1;
	
	@FindBy(id="login")
	private WebElement btnlogin1;

	public WebElement getTxtusername1() {
		return txtusername1;
	}

	public WebElement getTxtpassword1() {
		return txtpassword1;
	}

	public WebElement getBtnlogin1() {
		return btnlogin1;
	}
	
	
	
}