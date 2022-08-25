package com.Automation.Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripSearchPage extends BasePage{

		@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
		private WebElement btnSearch;
		
		
		@FindBy(xpath="//p[.='Air India']/../../../..//span[.='View Prices']")
		private WebElement btnView;
		
		@FindBy(xpath="//button[.='Book Now']")
		private WebElement btnBook;
		
		@FindBy(xpath="//div[@class='fareSubList']")
		private WebElement e1;
		
		@FindBy(xpath="//div[@id='FARE_SUMMARY']")
		private WebElement FareSum;
		@FindBy(xpath="//span[@class='langCardClose']")
		private WebElement closePopup;
		
		public void clickSearch()
		{
			btnSearch.click();
		}
		
		public void clickView()
		{
			btnView.click();
		}
		
		public void clickBook()
		{
			btnBook.click();
		}
		
		public void switchWindow(WebDriver obj1)
		{
			
			String parentWindow= obj1.getWindowHandle();
			Set<String> handles= obj1.getWindowHandles();
			for(String windowHandle: handles)
			{
				if(!windowHandle.equals(parentWindow))
				{
				obj1.switchTo().window(windowHandle);
				break;
				}
			}
		}
		
		public String getInfo1()
		{
		return(e1.getText());
		
		}
		
		public void clickclosePopup()
		{
			closePopup.click();
		}
		
}
