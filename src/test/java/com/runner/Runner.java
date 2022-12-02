package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sriva\\eclipse-workspace\\Myntra\\src\\test\\java\\com\\feature",
glue = "com.stepdefinition",
plugin = {"pretty",
		"html:Report/htmlReport.html",
		"json:Report/jsonReport.json",
		 "junit:Report/junitReport.xml",
		 "com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"},
monochrome = true,
dryRun = false)

public class Runner {
	public static WebDriver driver = null;

	@BeforeClass
	public static void setUp() {
		driver = Baseclass.browserLaunch();
	}

	@AfterClass
	public static void tearDown() {
		Baseclass.close();
	}

}
