package com.bromine.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
	
	@FindBy(id = "username")
	public WebElement fieldUsername;
	
	@FindBy(id = "password")
	public WebElement fieldPassword;
	
	@FindBy(css = "input[type=\"submit\"]")
	public WebElement buttonLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void open() {
		
		//driver.get(ConfigProperties.getProperty("login.url"));
	}
	}
