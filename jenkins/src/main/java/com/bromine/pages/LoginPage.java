package com.bromine.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bromine.data.UserData;

public class LoginPage extends Page {
	
    @FindBy(id = "UserName")
	public WebElement fieldUsername;
	
	@FindBy(id = "UserPassword")
	public WebElement fieldPassword;
	
	@FindBy(css = "input[type=\"submit\"]")
	public WebElement buttonLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void open() {	
	driver.get("http://localhost/");
	}
	
	public HomePage loginAs (UserData admin)
	{
	try {
	type (fieldUsername, admin.name);}
	catch (NoSuchElementException e){
    System.out.println("the control doesn't exist");
    }
	type (fieldPassword, admin.password);
	buttonLogin.click();
	return PageFactory.initElements(driver, HomePage.class);
	}
	}
