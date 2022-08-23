package demo;
import java.util.*;    
public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleInput = "Hello World How Are You";
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
		
		
		display(formatTheInput(sampleInput));
	}

	private static String formatTheInput(String sampleInput) {
		// TODO Auto-generated method stub
		String StringToReturn = "";
		// Code to format the String
		String[] words = sampleInput.split(" "); //Split the text into words
		LinkedHashSet<Character> firstLetters = new LinkedHashSet<Character>();  //Create a set to store first letters
		for (String word: words) //Iterate through each word
			firstLetters.add(word.charAt(0)); //Add first letter of each word		
			
		for(Character c: firstLetters) {  //Iterate through each character
			StringToReturn=StringToReturn+c+" : "; //Add letter and colon to string variable
			for(String word : words) //Iterate through each word
			if (word.charAt(0) == c) //If the word starts with the letter
				StringToReturn=StringToReturn+word+" "; //Append it to the String 
			StringToReturn=StringToReturn+"\n"; //Add a new line to the string 
		}
		return StringToReturn;
	}

	private static void display(String outputString) {
		System.out.println(outputString);
		// TODO Auto-generated method stub
		
	}

}