package com.assignment2.selenium_test.utils;

import java.util.Properties;

import org.openqa.selenium.By;

import com.assignment2.selenium_test.MyTestCase;

public class ConstantsXPath {

	static Properties props = new MyTestCase().loadProperties();
	public static final By COOKIES_POLICY_ACCEPTANCE = By.xpath(props.getProperty("Cookies_Policy_Acceptance"));
	public static final By lOGIN_BUTTON = By.xpath(props.getProperty("Login_Button"));

}
