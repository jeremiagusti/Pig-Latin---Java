package pig_latin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a word to be transformed into pig latin form: ");
		String word = input.nextLine(); // Input the word
		
		word = word.toUpperCase(); // Make the inputted word uppercase
		
		int wordLen = word.length(); // Find out the length
		char[] finalWord = new char[wordLen + 2];  // Make char array according to the length
		
		// Loop to find how many consonants before it meets vowel
		int numOfCons = Consonant.howManyCons(word, wordLen);
		
		// Moving the consonant
		Moving.moveCons(word, wordLen, finalWord, numOfCons);
		
		// Moving the rest of the letters
		Moving.moveRest(word, wordLen, finalWord, numOfCons);
		
		// Displaying the final word
		System.out.print("The pig latin version of inputted word is: ");
		Display.displayWord(finalWord);
		

		
		input.close();
	}
}
