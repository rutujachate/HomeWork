package ForLoopstring;
import java.util.Scanner;
public class CountVowels {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int count = 0;

	        // Convert to lowercase to make checking easier
	        str = str.toLowerCase();

	        // For loop to check each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if character is a vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Number of vowels: " + count);
	    }
	


}
