package testng.practices;

import org.testng.annotations.Test;

public class TC001 extends Annotations {
	
	@Test
	public void testcase1() {
		System.out.println("Running testng testcase1 from TC001");
	}

	@Test
	public void testcase2() {
		System.out.println("Running testng testcase2 from TC001");
	}

}
