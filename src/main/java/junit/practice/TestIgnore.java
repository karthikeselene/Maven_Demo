package junit.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestIgnore {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Running Before Class...");
	}
	
	@Before
	public void before() {
		System.out.println("Running Before Each Method...");
	}
	
	@Test
	public void test1() {
		System.out.println("Running Test 1....");
	}
	
	@Test
	public void test2() {
		System.out.println("Running Test 2....");
	}
	
	@Test
	public void test3() {
		System.out.println("Running Test 3....");
	}
	
	@Ignore
	@Test
	public void test4() {
		System.out.println("Running Test 4....");
	}
	
	@Test
	public void test5() {
		System.out.println("Running Test 5....");
	}
	
	@After
	public void after() {
		System.out.println("Running after Each Method...");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Running After Class...");
	}

}