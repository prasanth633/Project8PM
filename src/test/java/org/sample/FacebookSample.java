package org.sample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;

public class FacebookSample extends BaseClass {
	
	
	@Test
	public void test1() throws InterruptedException {
		
		//verify the url
		urlLaunch("https://www.facebook.com/");
		Assert.assertTrue("verify the url" ,CurrentUrl().contains("facebook"));
		
		LoginPage l = new LoginPage();
		
		//verify the username
		sendKeys(l.getTxtusername(), "prasanth123@gmail.com");
		Assert.assertEquals("verify the username", "prasanth123@gmail.com", getAttribute(l.getTxtusername()));
		
		//verify the password
		sendKeys(l.getTxtpassword(), "44660");
		Assert.assertEquals("verify the password", "44660", getAttribute(l.getTxtpassword()));
		
		//verify login valid or invalid
		click(l.getBtnlogin());
		Thread.sleep(5000);
		Assert.assertTrue("verify the login", CurrentUrl().contains("privacy_mutation_token"));
		
		
		// hard assert.... assert fail code will stop that line itself
		
		
		
		
		

	}


}
