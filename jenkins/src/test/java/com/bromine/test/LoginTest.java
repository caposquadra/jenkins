package com.bromine.test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {
	private WebDriver driver;
	private String baseUrl;
	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl);
		
		try {
		driver.findElement(By.id("UserName1")).clear();
		driver.findElement(By.id("UserName1")).sendKeys("admin1");}
		catch (NoSuchElementException e){
		System.out.println("the field does't exist");
		}
		try {
			driver.findElement(By.id("UserPassword")).clear();
			driver.findElement(By.id("UserPassword")).sendKeys("admin1");
		}
		catch (NoSuchElementException e){
			System.out.println("the field does't exist");
			}
		try {
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		}
		catch (NoSuchElementException e){
			System.out.println("the button does't exist");}
		try {
		new Select(driver.findElement(By.id("ProjectProjectId"))).selectByVisibleText("Google Sample");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		}
		catch (NoSuchElementException e){
			System.out.println("the page iss't opened");}
		driver.quit();
	}}
