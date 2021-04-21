package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

		@Given("I am a sports administrator")
		public void i_am_a_sports_administrator() {
			System.out.println("First");
		}

		@Given("an name1 has generated a result")
		public void an_name1_has_generated_a_result() {
			System.out.println("Second");
		}
		
		@When("I register the athlete's score for the something")
		public void i_register_the_athlete_s_score_for_the_something() {
			System.out.println("Third");
		}
		
		@Then("I want to see the success")
		public void i_want_to_see_the_success() {
			System.out.println("Fourth");
		}
		
		//Metod som räknar ut
		}



