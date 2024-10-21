package com.assignment2.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCall {
	public static WebDriver edgeDriverCall() {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		return driver;
	}

	public static WebDriver driverCall(String browserName) {
		WebDriver driver;
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = edgeDriverCall();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = chromeDriverCall();
		} else {
			driver = edgeDriverCall();
		}

		return driver;

	}

	private static WebDriver chromeDriverCall() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		return driver;

	}
}
