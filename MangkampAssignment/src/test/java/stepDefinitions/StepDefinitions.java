package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
		@Given("I am an athlete")
		public void i_am_an_athlete() {
			System.out.println("First");
		}

		@When("I compete in 100m")
		public void i_compete_in_100m() {
			System.out.println("Second");
		}
		
		@Then("I want to see my result")
		public void i_want_to_see_my_result() {
			System.out.println("Third");
		}



}
