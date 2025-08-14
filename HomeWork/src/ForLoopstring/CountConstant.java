package ForLoopstring;
import java.util.Scanner;
public class CountConstant {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int count = 0;

	        // Convert to lowercase for easy comparison
	        str = str.toLowerCase();

	        // Check each character using for loop
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if it's a letter
	            if (ch >= 'a' && ch <= 'z') {
	                // If it's not a vowel, then it's a consonant
	                if (!(ch == 'a' || ch == 'e' || ch == 'i' || 
	                      ch == 'o' || ch == 'u')) {
	                    count++;
	                }
	            }
	        }

	        System.out.println("Number of consonants in the string: " + count);

	        sc.close();
	    }
	

}
