package mainClass;

public class Events {
	if (gender == 1) {
		System.out.println("Track");
		for (int i = 0; i < numParticipants; i++) {
			System.out.print("Insert result in seconds for " + newParticipants[i].getName() + ": ");
			double resultEvent = scan.nextDouble();
			counter.fourHundredMD(resultEvent);
			System.out.println(counter.getResult());
			resultEvent = scan.nextDouble();
			
			System.out.print("Insert result in seconds for " + newParticipants[i].getName() + ": ");
			counter.longJumpD(resultEvent);
			System.out.println(counter.getResult());} 
		
	} else if (gender == 2) {
		System.out.println("Field");
		for (int i = 0; i < numParticipants; i++) {
			System.out.print("Insert result in centimeters for " + newParticipants[i].getName() + ": ");
			double resultEvent = scan.nextDouble();
			counter.javelinThrowH(resultEvent);
			System.out.println(counter.getResult());
		}
	} else {
		System.out.println("Please, choose 1 or 2!");
	}
}
