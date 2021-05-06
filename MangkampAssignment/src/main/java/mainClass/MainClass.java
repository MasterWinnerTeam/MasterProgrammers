package mainClass;

import java.util.Scanner;

public class MainClass {
	//TEST 2021-04-30

	public static void main(String[] args) {
	//	String[][] eventVariables = {{"25", "24","1"}, {
		
		System.out.println("Welcome to the olympic games!");
		Scanner scan = new Scanner(System.in);

		System.out.print("How many participants? ");
		int numParticipants = scan.nextInt();
		Participants[] newParticipants = new Participants[numParticipants];
		
		System.out.println("Example: Pär Gren SWE");
		for (int i = 0; i < numParticipants; i++) {
			System.out.print("Name of participant " + (i + 1) + " and nationality: ");
			
			String name = scan.next() + scan.nextLine();
			newParticipants[i] = new Participants(name);
			}
			for(int i = 0; i < numParticipants; i++) {
			System.out.println((i + 1) + " " + newParticipants [i].getName());
			}
			{
				ResultCounter counter =new ResultCounter();
				
				System.out.println("Track");
				for (int i = 0; i < numParticipants; i++) {
				System.out.print("Insert result in seconds for " +newParticipants[i].getName() + ": ");
				double resultEvent = scan.nextDouble();
				counter.fourHundredMD(resultEvent);
				System.out.println(counter.getResult());
			}
				System.out.println("Field");
				for (int i = 0; i < numParticipants; i++) {
				System.out.print("Insert result in centimeters for " +newParticipants[i].getName() + ": ");
				double resultEvent = scan.nextDouble();
				counter.javelinThrowH(resultEvent);
				System.out.println(counter.getResult());
			}
		}
	}
}


