package testng.practices;

import org.testng.annotations.Test;

public class TC002 extends Annotations {
	
	@Test
	public void testcase1() {
		System.out.println("Running testng testcase1 from TC002");
	}

	@Test
	public void testcase2() {
		System.out.println("Running testng testcase2 from TC002");
	}

}
