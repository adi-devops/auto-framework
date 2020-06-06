package com.abc.automate.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features    =   {   "src/test/resources/com/abc/automate/cucumber",
		},
		glue        =   {   "com.abc.automate.cucumber" 
		}
		)
public class CucumberTest {

}
