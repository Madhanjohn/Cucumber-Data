package com.runner;

import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue="com.stepdefinition",
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})
public class TestRunner1 {
	
	
	public static WebDriver driver;
	
	
	@org.junit.BeforeClass
	public static void set_Up() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\SampleCucumber1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@org.junit.AfterClass
	public static void tear_Down() {
		driver.close();
	}
	

}
