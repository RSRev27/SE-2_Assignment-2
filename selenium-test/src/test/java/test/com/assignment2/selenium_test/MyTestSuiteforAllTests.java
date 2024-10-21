package test.com.assignment2.selenium_test;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("junit-jupiter")
@SelectPackages({"test.com.assignment2.selenium_test"
	,"com.assignment2.selenium_test"})
//@IncludeTags("production")
//@Suite
@SelectClasses({SelinumTest.class})
public class MyTestSuiteforAllTests {

}
