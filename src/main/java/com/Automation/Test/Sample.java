package com.Automation.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Automation.GenericUtils.DriverUtils;

public class Sample {
	public static void main(String args[])
	{
		DriverUtils.getDriver().get("https://www.makemytrip.com/");
		WebDriver obj1= new ChromeDriver();
		
		
		WebElement e=obj1.findElement(By.xpath("//p[.='Azadi Mahotsav Offer with Taj:']"));
		System.out.println(e.getText());
	}

}
