package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

		@Given("I am a sports adminstraitor")
		public void i_am_a_sports_adminstraitor() {
		    System.out.println("First");
		}

		@When("I register an name1")
		public void i_register_an_name1() {
			System.out.println("First");
		}

		@When("I want to register their {int}")
		public void i_want_to_register_their(Integer int1) {
			System.out.println("First");
		}
		
		@Then("I want to see the total score")
		public void i_want_to_see_the_total_score() {
			System.out.println("First");
		}
		
}

