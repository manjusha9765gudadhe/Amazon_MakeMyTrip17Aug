package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBuyPage extends BasePage {
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement clickBuynow;
	
	@FindBy(xpath="//span[.='Add Debit/Credit/ATM Card']")
	private WebElement selectcard;
	
	@FindBy(xpath="//a[.='Add a credit or debit card']")
	private WebElement clickaddcard;
	
	@FindBy(xpath="//iframe[contains(@name,'ApxSecureIframe')]")
	private WebElement frame;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	private WebElement creditnum;
	
	@FindBy(xpath= "//button[.='Cancel']")
	private WebElement btnCancel;
	
	
	/*public void clickBuy()
	{
		clickBuynow.click();
	}*/
	public void clickSelectcard()
	{
		selectcard.click();
	}
	public void clickaddcard()
	{
		clickaddcard.click();
	}
	public void switchFrame(WebDriver obj1)
	{
		obj1.switchTo().frame(frame);
	}
	public void putframe(String str)
	{
		creditnum.sendKeys(str);
	}
	public void clickCancel()
	{
		btnCancel.click();
	}
}
