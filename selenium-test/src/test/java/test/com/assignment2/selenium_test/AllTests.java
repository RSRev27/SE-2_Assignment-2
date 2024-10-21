package test.com.assignment2.selenium_test;

import java.util.Arrays;

import org.testng.TestNG;

public class AllTests {
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestSuites(Arrays.asList("src/main/resources/testng.xml"));
		testng.run();
	}
}
