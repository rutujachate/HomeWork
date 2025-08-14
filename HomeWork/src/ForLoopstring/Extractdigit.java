package ForLoopstring;
import java.util.Scanner;
public class Extractdigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String digits = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If character is a digit, add to result
	            if (ch >= '0' && ch <= '9') {
	                digits = digits + ch;
	            }
	        }

	        if (digits.isEmpty()) {
	            System.out.println("No digits found in the string.");
	        } else {
	            System.out.println("Extracted digits: " + digits);
	        }

	        sc.close();
	    }
	

}
