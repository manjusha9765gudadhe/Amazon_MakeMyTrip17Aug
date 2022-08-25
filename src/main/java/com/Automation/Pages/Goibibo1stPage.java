package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Goibibo1stPage extends BasePage {

	@FindBy(xpath="//span[.='SEARCH FLIGHTS']")
	private WebElement btnSearch;
	
	public void clickSearch()
	{
		btnSearch.click();
	}
}
