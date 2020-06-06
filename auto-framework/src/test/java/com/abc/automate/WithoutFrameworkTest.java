package com.abc.automate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutFrameworkTest {
	
	@Test
	public void loginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='login']")).click();

		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void loginTestFinder() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath(".//input[@name='login']")).click();
		
		
		driver.findElement(By.xpath(".//input[@value='Business']")).click();
		driver.findElement(By.xpath(".//input[@name='findFlights']")).click();

		
		assertEquals("Select a Flight: Mercury Tours", driver.getTitle());
		driver.quit();
	}


}
