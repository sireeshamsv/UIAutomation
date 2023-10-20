package com.automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.LoginPage;


public class LoginTest extends BaseTest {
	 private WebDriver driver;
	    private LoginPage loginPage;

	    @BeforeTest
	    public void setUp() throws IOException {
	    	driver = getDriver();
	        driver.get("https://mail.google.com");
	        driver.manage().window().maximize();
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void validLoginTest() {
	    	
	    	loginPage.enterUsername("user123");
	    	loginPage.enterPassword("password123");

	        // Add assertions and verifications for a successful login
	    }

	    @AfterTest
	    public void discontinueBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
