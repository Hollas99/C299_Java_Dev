package doge;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] breeds = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
		
		System.out.print("What is your dog's name?: ");
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
    	String dogName = userInput.nextLine();
    	System.out.println("Well then, I have this highly reliable report on "+dogName+"'s prestigious background right here.");
    	System.out.println(dogName+" is:");
    	

    	int[] randNums = {0,0,0,0,0};
    	int randN;
    	for (int i=0; i<breeds.length;i++) {
    		randN = rand.nextInt(96+i-randNums[0]-randNums[1]-randNums[2]-randNums[3])+1;
    		if (i==4) {
    			System.out.println((100-randNums[0]-randNums[1]-randNums[2]-randNums[3])+"% " +breeds[i]);
    			break;
    		}
    		System.out.println(randN+"% " +breeds[i]);
    		randNums[i]=randN;
    	}
    	
    	

	}

}
