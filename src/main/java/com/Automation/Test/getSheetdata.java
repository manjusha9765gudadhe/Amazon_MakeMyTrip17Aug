package com.Automation.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Automation.GenericUtils.FileRead1;
public class getSheetdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username= FileRead1.getData("C:\\Users\\manjusha.gudadhe\\eclipse-workspace\\Amazon_MakeMyTrip17Aug\\src\\test\\resources\\Data\\FetchData.xlsx","SheetLogin",0,0);
		String password= FileRead1.getData("C:\\Users\\manjusha.gudadhe\\eclipse-workspace\\Amazon_MakeMyTrip17Aug\\src\\test\\resources\\Data\\FetchData.xlsx","SheetLogin",0,1);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manjusha.gudadhe\\eclipse-workspace\\GL_Automation_27july\\src\\Driver\\chromedriver.exe");
		WebDriver obj1= new ChromeDriver();//Upcasting
		obj1.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		obj1.manage().window().maximize();
		WebElement e1= obj1.findElement(By.id("txtUsername"));
		e1.sendKeys(Username);
		WebElement e2= obj1.findElement(By.id("txtPassword"));
		e2.sendKeys(password);
		System.out.println("Data: "+Username);
		System.out.println("\n"+password);
	}

}
