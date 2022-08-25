package com.Automation.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;


public class BaseTest {
	@BeforeMethod
	public void Precondition() throws FileNotFoundException, IOException
	{
			DriverUtils.createDriver();
			PropertyReader.initProperty();
				
	}
}
