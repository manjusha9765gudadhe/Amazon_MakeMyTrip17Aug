package com.Automation.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.AmazonLoginPage;

public class AmazonLoginTest extends BaseTest {
	@Test
	public void VerifysuccessfulLogin()
	{
			DriverUtils.getDriver().get("https://www.amazon.in/");
			AmazonLoginPage l= new AmazonLoginPage();
			l.clickLogin();
			l.enterEmail(PropertyReader.getProp("Mobile"));
			l.clickContinue();
			l.clickOTP();
			
	}

}
