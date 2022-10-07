package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Amazon.Base_Class_Amazon;
import com.Property.Amazon.ConfigurationHelper_Amazon;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//feature//Amazonstudy.feature", glue = "com.stepdefinition", plugin = {
		"html:Report/HtmlReport1.html", "junit:Report/XmlReport1.xml", "json:Report/JsonReport1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport1.html" })

public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {

		String browser = ConfigurationHelper_Amazon.getInstance().getBrowser();
		driver = Base_Class_Amazon.browserLaunch(browser);

		Base_Class_Amazon.maximize();

	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}
}
