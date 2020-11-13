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
	private String today;
	private String gender;
	private String actualAnswer;
	@Given("customer is not married")
	public void customer_is_not_married() {
		this.marriage = "not married";

	}
	
	@Given("today is Sunday")
	public void today_is_Sunday() {
	today = "Sunday";
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
	
	@Given("I am other")
	public void f() {
		gender = "anything else!";
	}
	@Given("gender is {string}")
	public void gender_is(String gender) {
		this.gender = gender;
	}
	@When("I ask about your gender")
	public void i_ask_about_your_gender() {
		actualAnswer = "Male";
	}
	@Then("I should be told gender {string}")
	public void i_should_be_told_gender(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}

	@When("I ask if you are male")
	public void i_ask_if_you_are_male() {
		assertEquals("Male", actualAnswer);
	}



}













