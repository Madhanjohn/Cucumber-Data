package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.poi.util.CommonsLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.log4testng.Logger;

import com.excel.ExcelUtility;
import com.runner.TestRunner1;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import log4jExamples.BasicConfigure;

public class StepDefinition {
	
	public static WebDriver driver = TestRunner1.driver;
	ExcelUtility excell = new ExcelUtility("C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\SampleCucumber1\\User_Details.xlsx");
	static Logger logger = Logger.getLogger(BasicConfigure.class);
		
	@When("^User Enter urlname in address bar \"([^\"]*)\"$")
	public void user_Enter_urlname_in_address_bar(String urlname) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Logger files");
		 driver.get(urlname);
		 driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		 Thread.sleep(2000);
	}
	
	@When("^User Enter username and password$")
	public void user_Enter_username_and_password() throws Throwable {
		logger.info("username entered");
	   List<Map<String, String>> exdata = excell.getTestDataInMap();
	   driver.findElement(By.id("ap_email")).sendKeys(exdata.get(0).get("Email"));
	   driver.findElement(By.id("continue")).click();
	   driver.findElement(By.id("ap_password")).sendKeys(exdata.get(0).get("Password"));
	   Thread.sleep(2000);
	   	}

	@Then("^User Enter Flipcart homepage$")
	public void user_Enter_Flipcart_homepage() throws Throwable {
		logger.info("password entered");
	  driver.findElement(By.id("signInSubmit")).click();
	  
	}


}
