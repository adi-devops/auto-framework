package com.abc.automate.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.automate.page.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefs {

	WebDriver driver;

	@Given("^I am on mercury home page$")
	public void i_am_on_mercury_home_page() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^I give valid crednetials$")
	public void i_give_valid_crednetials() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.login("mercury", "mercury");
	}

	@Then("^I should see flight search page$")
	public void i_should_see_flight_search_page() throws Throwable {
		assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
		driver.quit();
	}


}
