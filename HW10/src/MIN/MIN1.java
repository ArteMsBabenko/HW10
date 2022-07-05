package MIN;

import java.util.Scanner;

public class MIN1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entep palindrome");
		
		String word = sc.next(); 
		
		if(word.length()==5) {
			String wordArray [] = word.split("");
			
			if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3])) ) {
				
			} else {
				System.out.println("This word is not palindrome");
			}
			
		} else { System.out.println("You must enter a five-letter word");
			
		}
		
	}

}
