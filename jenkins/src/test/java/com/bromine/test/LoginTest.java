package com.bromine.test;

import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;

import com.bromine.pages.HomePage;
import com.bromine.pages.LoginPage;

public class LoginTest extends BasicTestCase {
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private HomePage homePage;

	@Test
	public void testUntitled() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(admin);
	}}
