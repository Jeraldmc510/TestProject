package testdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1Test {
 
	@Test
	public void test1() {
		String browser = System.getProperty("browser");
		System.out.println(browser);
	//	System.out.println(browser);
		Reporter.log("Testing Demo1Test class", true);
		
	}
}
