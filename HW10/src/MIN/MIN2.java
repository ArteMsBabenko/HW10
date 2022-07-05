package MIN;

import java.util.Scanner;

public class MIN2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text");
		
		String text = sc.nextLine();
		
		System.out.println(text.replace('a','-').replace('e','-').replace('u','-').replace('y','-').replace('o','-').replace('i','-'));
		
	}

}
