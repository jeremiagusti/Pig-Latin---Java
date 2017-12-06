package pig_latin;

public class Moving {
	public static void moveCons(String word, int wordLen, char[] finalWord, int numOfCons) {
		/*
		 * Number for subtracting the index in finalWord array
		 * The number has to decrement
		 */
		int consIndexSubs = numOfCons; 
		
		// Iteration for every consonant
		for (int i = 0; i < numOfCons; i++) {
			finalWord[finalWord.length - (2 + consIndexSubs)] = word.charAt(i);
			consIndexSubs--;
		}
	}
	
	public static void moveRest(String word, int wordLen, char[] finalWord, int numOfCons) {
		int count = 0;
		
		for (int i = numOfCons; i < wordLen; i++) {
			finalWord[count] = word.charAt(i); 
			count++;
		}
	}
}
