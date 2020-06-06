package com.abc.automate.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath=".//input[@name='userName']")
	private WebElement username;
	
	@FindBy(xpath=".//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath=".//input[@name='login']")
	private WebElement login;

	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public FindFlight login(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.login.click();
		
		return new FindFlight(driver);
	}
	
	

}
