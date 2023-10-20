package Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='userId-text-input-field']")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id='password-text-input-field']")
	WebElement passWord;
        
    public LoginPage(WebDriver driver) throws IOException {
       super(driver);
    }
     
    public void enterUsername(String username) {
    	userName.sendKeys("Username123");
    }
    public void enterPassword(String password){
    	passWord.sendKeys("Password123");
    }   
}
