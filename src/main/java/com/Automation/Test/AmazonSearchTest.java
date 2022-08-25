package com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.AmazonLoginPage;
import com.Automation.Pages.AmazonSearchPage;

public class AmazonSearchTest extends BaseTest{
	
	@Test
	public void VerifySearch()
	{
		DriverUtils.getDriver().get("https://www.amazon.in/");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	AmazonLoginPage l= new AmazonLoginPage();
	
	l.clickLogin();
	l.enterEmail(PropertyReader.getProp("Mobile"));
	l.clickContinue();
	l.clickOTP();	
	AmazonSearchPage s= new AmazonSearchPage();
	
	s.enterSearch(PropertyReader.getProp("SearchKeyword"));
	s.clickSearchbtn();
	}
}
