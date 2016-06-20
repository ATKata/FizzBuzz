package kata.fizzbuzz;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	private int number;
	private FizzBuzz game;
	private String result;

	@Given("^the number (\\d+)$")
	public void the_number(int number) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.number=number;
	}

	@When("^I play FizzBuzz$")
	public void i_play_FizzBuzz() throws Throwable {
	    game = new FizzBuzz();
	    result = game.play(number);
	    
	}

	@Then("^I say \"(.*?)\"$")
	public void i_say(String expected) throws Throwable {
	    assertEquals(expected, result);
	}
}
