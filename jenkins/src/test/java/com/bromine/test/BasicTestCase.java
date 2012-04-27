package com.bromine.test;

import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.bromine.data.UserData;
//import com.bromine.utils.ConfigProperties;

public class BasicTestCase {

	protected static WebDriver driver;

    public UserData admin = new UserData("admin", "admin");

    protected WebDriver getWebDriver () {
	if (driver == null) {
		driver = new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
        return driver;
   }

    //@AfterMethod
	//@AfterTest
	//public void tearDown() throws Exception {
	//	driver.quit();
	//}	
}






