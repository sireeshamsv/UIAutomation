package com.automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.utility.JiraCreateIssue;
import com.test.LoginPage;


public class LoginTest extends BaseTest {
	 private WebDriver driver;
	    private LoginPage loginPage;
	    private String baseUrl;

	    @BeforeTest
	    public void setUp() throws IOException {
	    	driver = getDriver();
	    	baseUrl = "https://mail.google.com";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        loginPage = new LoginPage(driver);
	    }
	    
	    //@Test
	    public void validLoginTest() {
	    	
	    	loginPage.enterUsername("user123");
	    	loginPage.enterPassword("password123");
	    }
	    
	    @JiraCreateIssue(isCreateIssue = true)
		//@Test
		public void JiraHomePageText()
		{
			driver.get(baseUrl);
			WebElement homeElementText = driver.findElement(By.id("iMain"));
			assertEquals(homeElementText.getText(),"Home Page","Comparsirion of Home Page Header Text");
		}

	    @AfterTest
	    public void discontinueBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
