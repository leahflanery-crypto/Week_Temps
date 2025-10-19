import java.util.Scanner;
public class Weekly_Temps {

	public static void main(String[] args) {	
		Scanner scnr = new Scanner(System.in);
		final int NUM_DAYS = 7;
		String[] userDays = new String[NUM_DAYS];
		int [] userTemps = new int[NUM_DAYS];
		for (int i = 0; i < userDays.length; ++i) {
			System.out.println("Enter day of the week: ");
			String dayInput = scnr.nextLine();
			userDays[i] = dayInput;

			System.out.println("Enter temperature for that day: ");
	         int temp = scnr.nextInt();
	         scnr.nextLine();
	         userTemps[i] = temp;
		}
		System.out.print("Type a day of the week to see its temperature, or type 'week' to see all temperatures and the weekly average: ");
		String userChoice = scnr.nextLine();
		if (userChoice.equals("week")){
			for (int i = 0; i < NUM_DAYS; ++i) {
			    System.out.println(userDays[i] + ": " + userTemps[i] + " degrees");
			}
			int total = 0;
			for (int i = 0; i < NUM_DAYS; ++i) {
			    total += userTemps[i];
			}
			double average = (double) total / NUM_DAYS;
			System.out.println("Weekly average temperature: " + average + " degrees");
		}
		
		 else {
		 boolean found = false;
		 for (int i = 0; i < NUM_DAYS; ++i) {
			  if (userChoice.equalsIgnoreCase(userDays[i])) {
			  System.out.println(userDays[i] + ": " + userTemps[i] + " degrees");
			  found = true;
		 break;
	   }
	   }
	   if (!found) {
	System.out.println("Sorry, that day wasn't found.");
}
} boolean keepGoing = true;
while (keepGoing) {
    System.out.print("Type another day to see its temperature,or 'week' to see all or 'done' to exit: ");
    String nextChoice = scnr.nextLine();

    if (nextChoice.equalsIgnoreCase("done")) {
        keepGoing = false;
    } else if (nextChoice.equalsIgnoreCase("week")) {
        for (int i = 0; i < NUM_DAYS; ++i) {
            System.out.println(userDays[i] + ": " + userTemps[i] + " degrees");
        }
        int total = 0;
        for (int i = 0; i < NUM_DAYS; ++i) {
            total += userTemps[i];
        }
        double average = (double) total / NUM_DAYS;
        System.out.println("Weekly average temperature: " + average + " degrees");
    } else {
        boolean found = false;
        for (int i = 0; i < NUM_DAYS; ++i) {
            if (nextChoice.equalsIgnoreCase(userDays[i])) {
                System.out.println(userDays[i] + ": " + userTemps[i] + " degrees");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, that day wasn't found.");
        }
    }
}

System.out.println("Good Bye! Have a Great Day!");

}
}
