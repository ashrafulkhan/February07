package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeMethod
	public void beforeMethod() {
		
	}
	
	@Test
	public void test() {
		System.out.println("Bangladesh    ");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
	}

}
