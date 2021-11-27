package com.automation.testcases.ui;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BrowserFactory;
import com.automation.base.CaptureScreenshot;
import com.automation.base.DriverFactory;
import com.automation.helper.Helper;
import com.aventstack.extentreports.Status;

public class TestCase1 extends Helper {
	BrowserFactory browserFactory = new BrowserFactory();
	public WebDriver driver;
	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		WebDriver driverInst = browserFactory.getDriver("chrome");
		DriverFactory.getInstance().setDriver(driverInst);
		driver = DriverFactory.getInstance().getDriver();
	}
	
	@Test
	public void Testcase_Google() {
		browserFactory = new BrowserFactory();
		try {
			test = extent.createTest("Testcase_Google", "Sample test to generate report");
			System.out.println("in Google");
			driver.get("http://www.google.com");
			Thread.sleep(3000);
			test.log(Status.INFO, "Loaded google website");
			String bookingDetailsFile = System.getProperty("user.dir") + "\\Screenshots\\"
					+ "ScreenShotsFlightConfirmationDetails - " + CaptureScreenshot.getDateTimeStamp() + ".png";
			try {
				CaptureScreenshot.getScreenShot(driver, bookingDetailsFile);
				test.addScreenCaptureFromPath("xtent.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertTrue(true);
		DriverFactory.getInstance().closeBrowser();
	}
	
//	@Test
	public void Testcase_Google2() {
		test = extent.createTest("Testcase_Google2", "Sample test failed to generate report");
		AssertJUnit.assertEquals("abcd", "abcd");
		test.log(Status.INFO, "Failed test");
	}
}
