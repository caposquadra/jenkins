package com.bromine.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

	@FindBy(css = "css=#column2 > h1")
	public WebElement TextOnPage;

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
public boolean isLoggedIn ()
    {
	return isElementPresent(TextOnPage);
	}

public void open() {
	}
}