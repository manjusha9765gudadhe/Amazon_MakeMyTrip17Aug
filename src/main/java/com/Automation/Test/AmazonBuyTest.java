package com.Automation.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.AmazonAdd2CartPage;
import com.Automation.Pages.AmazonBuyPage;
import com.Automation.Pages.AmazonLoginPage;
import com.Automation.Pages.AmazonSearchPage;

public class AmazonBuyTest extends BaseTest{
	
	@Test
	public void VerifyBuy()
	{
		WebDriver obj1= DriverUtils.getDriver();
		DriverUtils.getDriver().get("https://www.amazon.in/");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	AmazonLoginPage l= new AmazonLoginPage();
	
	l.clickLogin();
	l.enterEmail(PropertyReader.getProp("Mobile"));
	l.clickContinue();
	l.clickOTP();	
	AmazonSearchPage s= new AmazonSearchPage();
	
	s.enterSearch(PropertyReader.getProp("SearchKeyword"));
	s.clickSearchbtn();
	AmazonAdd2CartPage c= new AmazonAdd2CartPage();
	c.clickitem();
	c.switchWindow(obj1);
	c.clickAddCart();
	AmazonBuyPage b= new AmazonBuyPage();
	//b.clickBuy();
	b.clickSelectcard();
	b.clickaddcard();
	b.switchFrame(obj1);
	b.putframe(PropertyReader.getProp("cardnum"));
	b.clickCancel();
	
	}
}
