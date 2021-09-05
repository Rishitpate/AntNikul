package selenium;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector(); //class in Junit to capture error

	@Test
	public void test6() {
		
		//In each test, you must have atleast one assertion.
		//Assertion is a way to figure out if a test pass or fail, usually compares actual and expected result.
		String expected = "abc";
		String actual = "abc1";
		System.out.println("before 1st assert");
		Assert.assertEquals(expected, actual); //Standard assert, this assert is used in the industry.
		//If assert fails, it will not execute remaining lines of the same test, execution go to the next test.
		System.out.println("after 1st assert");
		Assert.assertTrue("Verify 2>3", 2>3);
		System.out.println("after 2nd assert");
	}

	@Test
	public void test7() {
		
		//If assert fails, it will not execute remaining lines of the same test, execution go to the next test.
		//Try and catch method to continue execution despite assertion fail, but then test pass.
		//Error Collector to capture error and still continue the code.
		String expected = "abc";
		String actual = "abc1";
		System.out.println("before 1st assert");
		try {
			Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I am in first catch");
		}
		System.out.println("after 1st assert");
		try {
			Assert.assertTrue("Verify 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I am in second catch");
		}
		
		System.out.println("after 2nd assert");
	}

	
}
