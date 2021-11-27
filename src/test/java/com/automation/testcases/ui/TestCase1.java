package com.automation.testcases.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BrowserFactory;
import com.automation.base.CaptureScreenshot;
import com.automation.helper.Helper;
import com.aventstack.extentreports.Status;

public class TestCase1 extends Helper {
	
	
	@Test
	public void Testcase_Google() {
		try {
			test = extent.createTest("Testcase_Google", "Sample test to generate report");
			System.out.println("in Google");
			driver.get("http://www.google.com");
			test.log(Status.INFO, "Loaded google website");
			String bookingDetailsFile = System.getProperty("user.dir") + "\\Screenshots\\"
					+ "ScreenShotsFlightConfirmationDetails - " + CaptureScreenshot.getDateTimeStamp() + ".png";
			try {
				CaptureScreenshot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile);
				test.addScreenCaptureFromPath("xtent.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
	
	@Test
	public void Testcase_Google2() {
		test = extent.createTest("Testcase_Google2", "Sample test failed to generate report");
		Assert.assertEquals("abcd", "ansd");
		test.log(Status.INFO, "Failed test");
	}
}
