package ForLoopstring;
import java.util.Scanner;
public class ReplaceSpaces {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If space, replace with hyphen
	            if (ch == ' ') {
	                result = result + '-';
	            } else {
	                result = result + ch;
	            }
	        }

	        System.out.println("String after replacing spaces: " + result);

	        sc.close();
	    }
	


}
