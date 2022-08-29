package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int playerWins; //Define global variables 
    static int computerWins;
    static int ties;
    
	public static void main(String[] args) {
		Random rand = new Random();
		while (true) {
		    playerWins=0;
		    computerWins=0;
		    ties=0;
			
			System.out.println("Welcome to Rock, Paper, Scissors!");
		    int inputRounds=0;
		    
		    //Selecting number of  rounds
		    while (true){ //Loop until user enters int between 1-10
			    try {
				    System.out.print("How many rounds would you like to play? [1-10]: ");
					Scanner userInput = new Scanner(System.in);  // Create a Scanner object
			    	inputRounds = userInput.nextInt(); //Read users input
			    	if (inputRounds > 0 && inputRounds <= 10)  //Check the user input is between 1 and 10
			    		break;
			    	else //If input is not between 1 and 10,  throw exception to loop again
			    		throw new Exception();
			    }catch(Exception e){ //If user didn't enter an integer
			    	continue;
			    }
		    }
		    System.out.println("You have selected to play " + inputRounds +" round(s)");
	
		    //Game
		    for (int round=1; round<=inputRounds;round++) { //Loop for each round
	    		System.out.println("\nRound "+ round);
	    		int playerChoice = playerChoice(); //Get users choice
	    		int computerChoice = rand.nextInt(3)+1; //Generate computers choice
	    		winner(playerChoice, computerChoice); // Compare answers
		    }
		    //Results
		    System.out.println("\n\nThe game has finished!\nYou won "+playerWins+" games\nThe computer won "+computerWins+" games\nThere were "+ties+" ties!\n" );
		    if (playerWins>computerWins)
		    	System.out.println("Congratulations, You WIN!");
		    else if (computerWins>playerWins)
		    	System.out.println("Unlucky!, The computer beat you, better luck next time!");
		    else
		    	System.out.println("It's a tie!");
		    System.out.print("Would you like to play again? [y/n]: ");
		    Scanner userInput = new Scanner(System.in);
		    String answer = userInput.nextLine();
		    if (!answer.equalsIgnoreCase("y")) {
		    	System.out.println("Thanks for playing!");
		    	break;
		    }
	}
	    
	    
		
		
		
	}
	public static int playerChoice() {
		int userChoice;
    	while (true) { //Loop until user enters between 1 and 3
    		try {
			    System.out.print("Please enter your choice of Rock(1), Paper(2), or Scissors(3): ");
				Scanner userInput = new Scanner(System.in);  // Create a Scanner object
		    	userChoice = userInput.nextInt();
		    	if (userChoice >= 1 && userChoice <= 3) //Check the user input is between 1 and 3
		    		return userChoice;
		    	else //Throw exception if number not between 1 and 3
		    		throw new Exception();
    		}catch(Exception e) {
    			continue;
    		}
    	}
		
	}
	public static void winner(int player, int computer) {
    	if (computer == player) {
    		ties++;
    		System.out.println("It's a tie!");
    	}
    	else if ((computer == 1 && player == 2) || (computer == 2 && player == 3) || (computer == 3 && player == 1)) {
    		playerWins++;
    		System.out.println("You Won!");
    	}
    	else {
    		computerWins++;
    		System.out.println("The computer wins!");
    	}
	}
	
}
