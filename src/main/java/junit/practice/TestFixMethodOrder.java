package junit.practice;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFixMethodOrder {

	@Test
	public void abc() {
		System.out.println("Running Method a.");
	}

	@Test
	public void bac() {
		System.out.println("Running Method b.");
	}

	@Test
	public void cab() {
		System.out.println("Running Method c.");
	}

}