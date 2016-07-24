package com.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 

{
@Test
	public void test2()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.quit();
	}
	
}
