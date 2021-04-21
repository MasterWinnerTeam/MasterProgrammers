package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
		String input = "";
	
		@Given("I am a sports administrator")
		public void i_am_a_sports_administrator() {
		    System.out.println("First");
		}

		@When("I register an {athlete}")
		public void i_register_an_name1(String name1) {
			System.out.println("First");
			input = name1;
			//input av namn på atlet
		}

		@When("I register their {int}")
		public void i_register_their(Integer int1) {
			System.out.println("First");
		}
		
		@Then("I want to see the total score")
		public void i_want_to_see_the_total_score() {
			System.out.println("First");
		}
		
}

