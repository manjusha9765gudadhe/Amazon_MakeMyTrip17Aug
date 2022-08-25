package com.Automation.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPage extends BasePage {
	//Declaration
			@FindBy(xpath="//span[@class='nav-line-2 ']")
			private WebElement clickLogin;
			
			@FindBy(xpath="//input[@id='ap_email']")
			private WebElement TextEmail;
			
			@FindBy(xpath="//input[@id='continue']")
			private WebElement btnLogin;
			
			@FindBy(xpath="//span[@id='auth-login-via-otp-btn']")
			private WebElement btnOTP;
			
	//Utilization
			public void enterEmail(String str)
			{
				TextEmail.sendKeys(str);
			}
			
			public void clickLogin()
			{
			clickLogin.click();  
			}
			public void clickContinue()
			{
				btnLogin.click();
			}
			public void clickOTP()
			{
				btnOTP.click();
			}
			
			
}
