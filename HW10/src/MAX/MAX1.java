package MAX;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MAX1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text");
		
		String text = sc.nextLine();
		
		int count = 0;
		
		if(text.length() !=0) {
			count++;
			
			for (int i=0; i < text.length(); i++) {
				if(text.charAt(i) == ' ') {
					count++;
				}
			}
		}
		
		System.out.println("You entered" +  count  +  "words");
		
		String[] m = "Java is not easy, but Java can be useful".split(" ");
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for (int i = 0; i < m.length; i++) {
		    if (h.containsKey(m[i])) {
		        h.replace(m[i], h.get(m[i]) + 1);
		    } else {
		        h.put(m[i], 1);
		    }
		}
		String s = null;
		int p = 0;
		for (String w : h.keySet()) {
		    if (p < h.get(w)) {
		        p = h.get(w);
		        s = w;
		    }
		}
		System.out.println("The most used word: " + s );
		
	}
	
}
