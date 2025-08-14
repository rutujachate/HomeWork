package ForLoopstring;
import java.util.Scanner;
public class CapitalizeWords {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";
	        boolean newWord = true;  // Flag to detect word start

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch == ' ') {
	                // If space → just add and mark next char as start of new word
	                result = result + ch;
	                newWord = true;
	            } else {
	                if (newWord && ch >= 'a' && ch <= 'z') {
	                    // Capitalize first letter of word
	                    result = result + (char)(ch - 32);
	                } else {
	                    result = result + ch;
	                }
	                newWord = false;
	            }
	        }

	        System.out.println("Capitalized string: " + result);

	        sc.close();
	    }
	


}
