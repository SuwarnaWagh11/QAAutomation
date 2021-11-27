package com.automation.helper;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automation.base.BrowserFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Helper {

	public static WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public Helper() {
	}

	@BeforeSuite
	public void beforeSuite() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\ExtentReports\\"+ "XReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");
	
	}

	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		Helper.driver = BrowserFactory.getDriver("chrome");

	}

	@AfterMethod
	public void getResult(ITestResult result) {
       if(result.getStatus() == ITestResult.FAILURE) {
    	   //test.log(result.getStatus(), "Failed TEST CASE Name is "+result.getName());
       }
    }

	@AfterClass
	public void afterClass() {

	}

	@AfterSuite
	public void afterSuite() throws IOException, EmailException {
		extent.flush();
		driver.quit();
	}
}
