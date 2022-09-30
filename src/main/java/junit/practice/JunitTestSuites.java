package junit.practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TC001.class,
	TC002.class,
	TC003.class
})

public class JunitTestSuites {

}
