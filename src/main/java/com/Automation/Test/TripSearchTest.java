package com.Automation.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.TripSearchPage;

public class TripSearchTest extends BaseTest {
		
	
		@Test
		public void VerifySearch() throws InterruptedException
		{
			DriverUtils.getDriver().get("https://www.makemytrip.com/");
			Thread.sleep(10000);
			TripSearchPage t= new TripSearchPage();
			WebDriver obj1= new ChromeDriver();
			t.clickclosePopup();
			t.clickSearch();
			t.clickView();
			t.clickBook();
			//t.switchWindow(obj1);
			
			
		}
}
