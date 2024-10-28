package com.assignment2.selenium_test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment2.selenium_test.utils.ElementsConstants;
import com.assignment2.selenium_test.utils.MyDecryptionUtils;

public class MyTestCase {

	private static final String LIST2 = "Assignment2";
	private static final String LIST1 = "Assignment1";
	private static final String BOARD_NAME = "SE2 Assignment";

	// private static final By XPATH = ConstantsXPath.CookiesXPath;

	// WebElement element;

	public void loginWithInvalidCreds(WebDriver driver, WebElement element, WebDriverWait wait, Properties props)
			throws Exception {

		// String url = /*"https://www.trello.com/home";*/props.getProperty("URL");
		// System.out.println(url);
		// driver.get(url);

		// }

		element = driver.findElement(ElementsConstants.LOGIN_LINK);
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

		element = driver.findElement(ElementsConstants.LOGIN_LINK);
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

		element = driver.findElement(ElementsConstants.LOGIN_LINK);
		element.click();
		String userID = props.getProperty("ValidUserID");
		String pwd = MyDecryptionUtils.decrypt(props.getProperty("ValidPassword"));
		//element = driver.findElement(ElementsConstants.FORM_ID);
		//driver.switchTo().frame(element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.LOGIN_TEXT_BOX));
		element = driver.findElement(ElementsConstants.LOGIN_TEXT_BOX);
		
		element.clear();
		element.sendKeys(userID);
		element = driver.findElement(ElementsConstants.LOGIN_CONTINUE);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.LOGIN_PASSWORD_BOX));
		element = driver.findElement(ElementsConstants.LOGIN_PASSWORD_BOX);
		element.clear();
		element.sendKeys(pwd);
		element = driver.findElement(ElementsConstants.LOGIN_BUTTON);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.COOKIES_POLICY_ATLASSIAN));
		element = driver.findElement(ElementsConstants.COOKIES_POLICY_ATLASSIAN);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.CREATE_BUTTON));
		element = driver.findElement(ElementsConstants.CREATE_BUTTON);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.CREATE_BOARD));
		element = driver.findElement(ElementsConstants.CREATE_BOARD);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.BOARD_TITLE));
		element = driver.findElement(ElementsConstants.BOARD_TITLE);
		element.sendKeys(BOARD_NAME);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.BOARD_CREATE));
		element = driver.findElement(ElementsConstants.BOARD_CREATE);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.BOARD_SELECT));
		element = driver.findElement(ElementsConstants.BOARD_SELECT);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.ADD_LIST));
		element = driver.findElement(ElementsConstants.ADD_LIST);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.LIST_TEXTBOX1));
		element = driver.findElement(ElementsConstants.LIST_TEXTBOX1);
		element.sendKeys(LIST1);
		//element.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.ADD_LIST_BUTTON));
		element = driver.findElement(ElementsConstants.ADD_LIST_BUTTON);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.LIST_TEXTBOX2));
		element = driver.findElement(ElementsConstants.LIST_TEXTBOX2);
		element.sendKeys(LIST2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.ADD_LIST_BUTTON1));
		element = driver.findElement(ElementsConstants.ADD_LIST_BUTTON1);
		element.click();
		//element.sendKeys(Keys.ENTER);
		element.sendKeys(Keys.ESCAPE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.ADD_A_CARD1));
		element = driver.findElement(ElementsConstants.ADD_A_CARD1);
		element.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ElementsConstants.ADD_A_CARD2));
		
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
