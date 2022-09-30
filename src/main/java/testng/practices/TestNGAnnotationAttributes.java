package testng.practices;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(suiteName = "TestNGAnnotationAttributes")
public class TestNGAnnotationAttributes {
	
	@Test(description = "To validate a two strings", priority = 5)
	public void test1() {
		System.out.println("Description Attribute");
		Assert.assertEquals("Apple", "Apple");
	}

	@Test(testName = "ATC001", priority = 4)
	public void test2() {
		System.out.println("Name Attribute");
		Assert.assertEquals("Apple", "Apple");
	}
	
	@Test(timeOut = 1000, priority = 3)
	public void test3() throws InterruptedException {
		System.out.println("Timeout Attribute");
		//Thread.sleep(2000);
	}
	
	@Test(enabled = false)
	public void a() {
		System.out.println("Method a()");
	}
	
	@Test(priority = 1)
	public void b() {
		System.out.println("Method b()");
	}
	
	@Test(invocationCount = 3)
	public void aa() {
		System.out.println("Method aa() -> "+Thread.currentThread().getId());
	}
	
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void aaa() {
		System.out.println("Method aa() -> "+Thread.currentThread().getId());
	}
	
	@Test(invocationCount = 3, invocationTimeOut = 2000)
	public void abc() throws InterruptedException {
		System.out.println("Method aa() -> "+Thread.currentThread().getId());
		Thread.sleep(500);
	}
	
	@Test
	public void method1() {		
		Assert.assertEquals("Apple", "Mango");
		System.out.println("Base Method");
	}
	
	@Test(dependsOnMethods = {"method1"})
	public void method2() {
		System.out.println("Depends on the method method2()");
	}	
	
	@Test(dependsOnMethods = {"method1"}, alwaysRun = true)
	public void method3() {
		System.out.println("Depends on the method method3()");
	}
	
}