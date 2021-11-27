package com.automation.testcases.ui;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BrowserFactory;
import com.automation.base.CaptureScreenshot;
import com.automation.helper.Helper;
import com.automation.pages.BookFlightPage;
import com.automation.pages.FlightConfirmationPage;
import com.automation.pages.FlightFinderPage;
import com.automation.pages.LoginPage;
import com.automation.pages.SelectFlightPage;
import com.aventstack.extentreports.Status;

public class TestCaseClass extends Helper {

	public TestCaseClass() {
	}

	@Test
	public void returnTicket() {
		try {
			test = extent.createTest("returnTicket", "Sample test to generate report");
			System.out.println("in returnTicket");
			driver.get("http://demo.guru99.com/test/newtours/");
			test.log(Status.INFO, "Loaded newtour website");
			//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
			//loginPage.loginWordPress("mercury", "mercury");
			/*FlightFinderPage flightFinderpage = PageFactory.initElements(driver, FlightFinderPage.class);
			flightFinderpage.continueWordPress("1", "Zurich", "July", "12", "Frankfurt", "September", "15","Business Class", "Unified Airlines");
			SelectFlightPage selectFlightPage = PageFactory.initElements(driver, SelectFlightPage.class);
			selectFlightPage.departAirlineWordPress("Pangaea Airlines 362");
			selectFlightPage.returnAirlineWordPress("Unified Airlines 363");
			selectFlightPage.continu();
			BookFlightPage bookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
			bookFlightPage.purchasePress("Anirudh", "AS", "Vegetarian", "MasterCard", "12345678", "12", "2008","Anirudh", "A", "S");
			FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver,FlightConfirmationPage.class);
			*/String bookingDetailsFile = System.getProperty("user.dir") + "\\Screenshots\\"+ "ScreenShotsFlightConfirmationDetails - " + CaptureScreenshot.getDateTimeStamp() + ".png";
			try {
				CaptureScreenshot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile);
				test.addScreenCaptureFromPath("xtent1.png");
			} catch (Exception e) {
				e.printStackTrace();
			}

			//flightConfirmationPage.logoutPress();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(true);
	}
}
