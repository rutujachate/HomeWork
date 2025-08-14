package ForLoopstring;
import java.util.Scanner;
public class Replacevowels {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if vowel (both uppercase and lowercase)
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                result = result + '*'; // Replace vowel with '*'
	            } else {
	                result = result + ch;  // Keep other characters
	            }
	        }

	        System.out.println("String after replacing vowels: " + result);

	        sc.close();
	    }
	

}
