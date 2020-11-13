package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefs {
	String marriage;
	String sex;
	String notMarried;
	String married;
	String state;
	@Given("customer is not married")
	public void customer_is_not_married() {
		this.marriage = "not married";
		
	}
	
	@When("i ask you for you married")
	public void i_ask_you_for_you_married() {
		this.married = "married";
	}
	
	@Then("i should get married")
	public void i_should_get_married() {
		assertEquals("married", this.married);
	}
	
	@When("i ask you for you not married")
	public void i_ask_you_for_you_not_married() {
		this.notMarried = "not married";
	}

	@Then("i should get not married")
	public void i_should_get_not_married() {
		assertEquals("not married", this.notMarried);
	}
}













