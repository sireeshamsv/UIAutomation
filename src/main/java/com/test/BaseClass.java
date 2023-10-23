package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
protected WebDriver driver;
	
	public BaseClass(WebDriver driver) throws IOException {
		this.driver = driver;
	}
}
