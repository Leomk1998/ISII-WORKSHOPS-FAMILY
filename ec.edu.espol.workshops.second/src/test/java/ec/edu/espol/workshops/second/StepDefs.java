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
	int age;
	int prima;
	private String today;
	private String gender;
	private String actualAnswer;
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

	@When("i ask you for you age")
	public void i_ask_you_for_you_age() {
		this.age = 85;
	}
	
	@Then("I should be told the age and the value of your prima")
	public void i_should_get_age() {
		assertEquals(85, age);
	}

	

}
