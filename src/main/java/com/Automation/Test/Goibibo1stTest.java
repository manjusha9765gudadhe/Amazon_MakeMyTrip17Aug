package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.Goibibo1stPage;

public class Goibibo1stTest {
		
				@Test
				public void VerifyClick()
				{
					DriverUtils.getDriver().get("https://www.goibibo.com/");
					Goibibo1stPage g= new Goibibo1stPage();
					g.clickSearch();
				}
}
