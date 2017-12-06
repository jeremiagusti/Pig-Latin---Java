package pig_latin;

public class Consonant {
	
	private static char[] consonantList = 
		{ 
				'B', 'C', 'D', 'F', 
				'G', 'H', 'J', 'K', 
				'L', 'M', 'N', 'P', 
				'Q', 'R', 'S', 'T', 
				'V', 'W', 'X', 'Y', 
				'Z'
		}; 
	
	private static boolean isCons(char letter) {
		boolean isCons = false;
		
		for (int i = 0; i < consonantList.length; i++) {
			char a = consonantList[i];
			if (letter == a) {
				isCons = true;
				break;
			} else {
				continue;
			}
		}
		
		return isCons;
	}
	
	public static int howManyCons(String word, int wordLen) {
		int numOfCons = 0;
		
		for (int i = 0; i < wordLen; i++) {
			if(isCons(word.charAt(i))) {
				numOfCons++;
			} else {
				break;
			}
		}
		
		return numOfCons;
	}
}
