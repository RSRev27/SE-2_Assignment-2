package test.com.assignment2.selenium_test;

import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment2.selenium_test.DriverCall;
import com.assignment2.selenium_test.MyTestCase;
import com.assignment2.selenium_test.utils.ConstantsXPath;

//@Testable
@TestMethodOrder(OrderAnnotation.class)
public class SelinumTest {

	String browserName;

	WebDriver driver;

	MyTestCase myTestCase;

	Properties props;

	WebDriverWait wait;

	WebElement element;

	@BeforeEach
	public void testSetUp() throws InterruptedException {

		// Scanner scan = new Scanner(System.in);
		browserName = "chrome";// scan.next();
		driver = DriverCall.driverCall(browserName);
		myTestCase = new MyTestCase();
		props = myTestCase.loadProperties();
		driver.manage().window().maximize();
		String url = /* "https://www.trello.com/home"; */props.getProperty("URL");
		// System.out.println(url);
		driver.get(url);

		Thread.sleep(5000);

		wait = new WebDriverWait(driver, 10);

		// driver.switchTo().defaultContent();
		element = driver.findElement(ConstantsXPath.COOKIES_POLICY_ACCEPTANCE);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ConstantsXPath.COOKIES_POLICY_ACCEPTANCE));
		// driver.switchTo().defaultContent();
		// if (element.isEnabled()) {
		// element.submit();
		element.click();
		// By by = new By();
		// driver.wait(3000);
		// WebElement element =
		// driver.findElement(By.id("onetrust-accept-btn-handler"));
		// if(element.isEnabled()) {
		// element.submit();
		// }
		// element = driver.findElement(By.className("Buttonsstyles__Button-sc-1jwidxo-0
		// kTwZBr"));
		// element.click();

		// scan.close();

	}

	@AfterEach
	public void testTearDown() throws InterruptedException {
		Thread.sleep(10000);

		driver.quit();
		// scan.close();
	}

	// @ParameterizedTest()
	// @ValueSource(strings = { "chrome", "edge" })
	@Order(1)
	@Test // (expectedExceptions = InterruptedException.class)
	public void testLoginWithWrongCreds() throws Exception {
		/*
		 * Scanner scan = new Scanner(System.in); String browserName =
		 * "Edge";//scan.next(); scan.close();
		 */
		// new DriverCall();
		// WebDriver driver = DriverCall.driverCall(browserName);
		// driver.get("https://www.google.com");

		// driver.get("https://www.google.com");

		// MyTestCase myTestCase = new MyTestCase();
		myTestCase.loginWithInvalidCreds(driver, element, wait, props);
		// myTestCase.loginWithCorrectCreds(driver, props);

		// Thread.sleep(10000);

		// driver.quit();
		// scan.close();
	}

	@Order(2)
	@Test
	public void testLoginWithWrongCreds1() throws Exception {
		myTestCase.loginWithInvalidCreds1(driver, element, wait, props);
	}

	@Order(3)
	@Test
	public void testLoginWithCorrectCreds() throws Exception {
		myTestCase.loginWithValidCreds(driver, element, wait, props);

	}

}
