package com.Automation.Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonAdd2CartPage extends BasePage {

	
	@FindBy(xpath="//span[.='Apple iPhone 13 (128GB) - Starlight']/../../../..//span[.='71,900']")
	private WebElement item;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement clickBuynow;
	
	
	
	
	public void clickitem()
	{
		item.click();
		
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
	public void clickAddCart()
	{
		clickBuynow.click();
	}	
}
