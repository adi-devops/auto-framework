package com.abc.automate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.automate.page.FindFlight;
import com.abc.automate.page.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectTest {
	
	
	
	@Test
	public void testLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		HomePage homePage = new HomePage(driver);
		homePage.login("mercury", "mercury");
		
		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void testFindFlight() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		HomePage homePage = new HomePage(driver);
		FindFlight findFlight=homePage.login("mercury", "mercury");
		findFlight.selectBusiness();
		
		assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
		driver.quit();
	}
	

}
