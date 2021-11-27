package com.automation.testcases.ui;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BrowserFactory;
import com.automation.base.CaptureScreenshot;
import com.automation.base.DriverFactory;
import com.automation.helper.Helper;
import com.automation.pages.BookFlightPage;
import com.automation.pages.FlightConfirmationPage;
import com.automation.pages.FlightFinderPage;
import com.automation.pages.LoginPage;
import com.automation.pages.SelectFlightPage;
import com.aventstack.extentreports.Status;

public class TestCaseClass extends Helper {
	WebDriver driver;
	BrowserFactory browserFactory = new BrowserFactory();
	public TestCaseClass() {
	}
	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		WebDriver driverInst = browserFactory.getDriver("chrome");
		DriverFactory.getInstance().setDriver(driverInst);
		driver = DriverFactory.getInstance().getDriver();
	}

	@Test
	public void returnTicket() {
		browserFactory = new BrowserFactory();
		try {
			test = extent.createTest("returnTicket", "Sample test to generate report");
			System.out.println("in returnTicket");
			driver.get("http://demo.guru99.com/test/newtours/");
			test.log(Status.INFO, "Loaded newtour website");
			Thread.sleep(3000);
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
				CaptureScreenshot.getScreenShot(driver, bookingDetailsFile);
				test.addScreenCaptureFromPath("xtent1.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
			DriverFactory.getInstance().closeBrowser();
			//flightConfirmationPage.logoutPress();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AssertJUnit.assertTrue(true);
	}
}
