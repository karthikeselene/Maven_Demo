package testng.bootcamp.demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int count = 0;
	private int maxTry = 3;

	public boolean retry(ITestResult result) {		
		if (count < maxTry) {
			count++;
			return true;
		}
		return false;
	}	

}