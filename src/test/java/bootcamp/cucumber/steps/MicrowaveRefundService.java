package bootcamp.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MicrowaveRefundService {
	
	@Given("Jeff has bought a microwave for ${int}")
	public void jeff_has_bought_a_microwave_for_$(Integer int1) {
	    System.out.println("Is Jeff has bought a microwave in our branch "+int1);
	}
	
	@Given("he has a receipt")
	public void he_has_a_receipt() {
	    System.out.println("he has a receipt --> Yes");
	}
	
	@When("he returns the microwave")
	public void he_returns_the_microwave() {
	   System.out.println("he returns the microwave without damage --> Yes");
	}
	
	@Then("Jeff should be refunded ${int}")
	public void jeff_should_be_refunded_$(Integer int1) {
	    System.out.println("Jeff should be refunded --> "+int1);
	}

}
