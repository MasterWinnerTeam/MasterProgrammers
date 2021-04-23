package stepDefinitions;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
		String input = "";
		double result;
	
		@Given("I am a sports administrator")
		public void i_am_a_sports_administrator() {
		    System.out.println("First");
		}
		
		@When("I register an {string}")
		public void i_register_an(String string) {
			System.out.println("First");
			Scanner scan = new Scanner(System.in);

			System.out.print("How many participants? ");
			int numParticipants = scan.nextInt();
			Participants[] newParticipants = new Participants[numParticipants];

			for (int i = 0; i < numParticipants; i++) {
				System.out.print("Name the participants " + (i + 1) + ": ");
				String name = scan.next();
				newParticipants[i] = new Participants(name);
				}
			
			//input = name1;
			//input av namn på atlet
		}

		@When("I register their {int}")
		public void i_register_their(Integer int1) {
			System.out.println("First");
			//ekvation för B-P
			double A = 25.4347;
			double B = 18;
			double C = 1.81;
			double x = B-int1;
			double i = Math.pow(x, C);
			double resultekv = i*A;
			int result = (int)resultekv;
			System.out.println(result);
			
			
		//	result = Math.pow(1.81, (25.4347(18-10)));
			//Skriver in poängen från grenen
		}
		
		@Then("I want to see the total score")
		public void i_want_to_see_the_total_score() {
			System.out.println("First");
			
			//Int Poäng = (A(B-P)^C)
			//Uträkning sker från sparade värden och vi får poängen sparade
		}
}
		//metoder här???
		

