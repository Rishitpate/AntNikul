package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("Login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("Logout");
	}
	

	@Test
	public void test1() {
		//System.out.println("Login");
		//All the tests are independent of each other, meaning if test 1 fails, test 2 will still execute if code is right.
		System.out.println("test1");
		//System.out.println("Logout");
	}
	
	@Test
	public void test2() {
		//System.out.println("Login");
		System.out.println("test2");
		//System.out.println("Logout");
	}
	
	@Test
	public void test3() {
		//System.out.println("Login");
		System.out.println("test3");
		//System.out.println("Logout");
	}

}
