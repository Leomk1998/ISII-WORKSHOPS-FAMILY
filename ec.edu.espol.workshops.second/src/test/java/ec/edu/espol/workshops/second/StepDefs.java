package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefs {
	private String today;
	private String gender;
	private String actualAnswer;
	@Given("today is Sunday")
	public void today_is_Sunday() {
	today = "Sunday";
	}
	@Given("today is {string}")
	public void today_is(String today) {
	this.today = today;
	}
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
	actualAnswer = "Its Friday";
	}
	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
	assertEquals(expectedAnswer, actualAnswer);
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
