package com.abc.automate.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindFlight {
	
	WebDriver driver;
	
	@FindBy(xpath=".//input[@value='Business']")
	private WebElement business;
	
	@FindBy(xpath=".//input[@name='findFlights']")
	private WebElement findFlights;
	
	public FindFlight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectBusiness() {
		this.business.click();
		this.findFlights.click();
	}

}
