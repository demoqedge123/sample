package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1

{

@Test	
public void launchapp()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.quit();

}
	
}
