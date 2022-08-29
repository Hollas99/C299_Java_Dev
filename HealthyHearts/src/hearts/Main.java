package hearts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
		System.out.print("What is your age?: ");
    	int age = userInput.nextInt();
    	double max = 220-age;
    	System.out.println("Your maximum heart rate should be "+Math.round(max)+" beats per minute");
    	
    	System.out.println("Your target HR Zone is "+Math.round((max/100)*50)+"-"+Math.round((max/100)*85)+" beats per minute");
    	

	}

}
