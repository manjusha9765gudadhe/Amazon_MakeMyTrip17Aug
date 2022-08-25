package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage extends BasePage {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement SearchText;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement clickSearch;
	
	
	public void enterSearch(String str)
	{
		SearchText.sendKeys(str);
	}
	public void clickSearchbtn()
	{
		clickSearch.click();
	}
}
