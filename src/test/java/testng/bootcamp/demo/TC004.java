package testng.bootcamp.demo;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TC004 {
	
	int i = 0;
	
	@Test
	public void example1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void example2() {
		if(i < 2) {
			i++;
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}		
	}
	
	@Test
	public void example3() {
		Assert.assertTrue(true);
	}

}
