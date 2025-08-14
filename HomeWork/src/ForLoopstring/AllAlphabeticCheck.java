package ForLoopstring;
import java.util.Scanner;
public class AllAlphabeticCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        boolean allAlphabetic = true;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If character is not in a-z or A-Z, set flag false
	            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
	                allAlphabetic = false;
	                break;
	            }
	        }

	        if (allAlphabetic) {
	            System.out.println("All characters are alphabetic.");
	        } else {
	            System.out.println("The string contains non-alphabetic characters.");
	        }

	        sc.close();
	    }
	


}
