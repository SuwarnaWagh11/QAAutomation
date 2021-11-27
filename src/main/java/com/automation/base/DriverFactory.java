package com.automation.base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	//singleton design pattern - Only one instance exist ever, provide global access to that instance by creating getInstance method
	private DriverFactory() {
		
	}
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	//factory design pattern - Define separate factory method for creating object and create object by calling methods
	ThreadLocal<WebDriver> driverInstance = new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return driverInstance.get();
	}
	
	public void setDriver(WebDriver driverParam) {
		driverInstance.set(driverParam);
	}
	
	public void closeBrowser() {
		driverInstance.get().close();
		driverInstance.remove();
	}
}
