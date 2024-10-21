package com.assignment2.selenium_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment2.selenium_test.utils.ConstantsXPath;
import com.assignment2.selenium_test.utils.MyDecryptionUtils;

public class MyTestCase {

	// private static final By XPATH = ConstantsXPath.CookiesXPath;

	// WebElement element;

	public void loginWithInvalidCreds(WebDriver driver, WebElement element, WebDriverWait wait, Properties props)
			throws Exception {

		// String url = /*"https://www.trello.com/home";*/props.getProperty("URL");
		// System.out.println(url);
		// driver.get(url);

		// }

		element = driver.findElement(ConstantsXPath.lOGIN_BUTTON);
		element.click();
		String validUserID = props.getProperty("ValidUserID");
		//String invalidUserID = props.getProperty("invalidUserID");
		String invalidPwd = MyDecryptionUtils.decrypt(props.getProperty("InvalidPassword"));
		//String validPwd = MyDecryptionUtils.decrypt(props.getProperty("ValidPassword"));
		System.out.println("This is the user Id::" + validUserID + " and This is the Invalid password::" + invalidPwd);

	}
	
	public void loginWithInvalidCreds1(WebDriver driver, WebElement element, WebDriverWait wait, Properties props)
			throws Exception {

		// String url = /*"https://www.trello.com/home";*/props.getProperty("URL");
		// System.out.println(url);
		// driver.get(url);

		// }

		element = driver.findElement(ConstantsXPath.lOGIN_BUTTON);
		element.click();
		//String validUserID = props.getProperty("ValidUserID");
		String invalidUserID = props.getProperty("invalidUserID");
		//String invalidPwd = MyDecryptionUtils.decrypt(props.getProperty("InvalidPassword"));
		String validPwd = MyDecryptionUtils.decrypt(props.getProperty("ValidPassword"));
		System.out.println("This is the user Id::" + invalidUserID + " and This is the Invalid password::" + validPwd);

	}

	public void loginWithValidCreds(WebDriver driver, WebElement element, WebDriverWait wait, Properties props)
			throws Exception {

		// }

		element = driver.findElement(ConstantsXPath.lOGIN_BUTTON);
		element.click();
		String userID = props.getProperty("ValidUserID");
		String pwd = MyDecryptionUtils.decrypt(props.getProperty("ValidPassword"));
		System.out.println("This is the user Id::" + userID + " and This is the Valid password::" + pwd);
	}

	public Properties loadProperties() {
		Properties props = new Properties();
		try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
			props.load(input);
			// return properties.getProperty("browserName", "chrome"); // Default to chrome
		} catch (IOException ex) {
			ex.printStackTrace();
			// return "chrome"; // Default value on error
		}
		return props;
	}

}
