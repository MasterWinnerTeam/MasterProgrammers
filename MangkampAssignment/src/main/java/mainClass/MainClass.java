package mainClass;

import java.util.Scanner;



public class MainClass {

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
			
			String name = scan.next();
			newParticipants[i] = new Participants(name);
			}
			for(int i = 0; i < numParticipants; i++) {
			System.out.println((i + 1) + " " + newParticipants [i].getName());
			}
			System.out.println("Insert result");
			double result = scan.nextDouble();
			}
	}
	



