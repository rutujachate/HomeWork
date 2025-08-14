package ForLoopstring;
import java.util.Scanner;
public class DigitReplacement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If digit, replace with #
	            if (ch >= '0' && ch <= '9') {
	                result = result + '#';
	            } else {
	                result = result + ch;
	            }
	        }

	        System.out.println("String after replacing digits: " + result);

	        sc.close();
	    }
	

}
