package testng.practices;

import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups = {"GroupA", "GroupB"})
	public void method1() {
		System.out.println("Running method1() which under GroupA");
	}

	@Test(groups = {"GroupB"})
	public void method2() {
		System.out.println("Running method2() which under GroupB");
	}

	@Test(groups = {"GroupA"})
	public void method3() {
		System.out.println("Running method3() which under GroupA");
	}

	@Test(groups = {"GroupB"})
	public void method4() {
		System.out.println("Running method4() which under GroupB");
	}

	@Test(groups = {"GroupA"})
	public void method5() {
		System.out.println("Running method5() which under GroupA");
	}


}