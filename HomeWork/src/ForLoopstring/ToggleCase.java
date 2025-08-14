package ForLoopstring;
import java.util.Scanner;
public class ToggleCase {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If uppercase -> convert to lowercase
	            if (ch >= 'A' && ch <= 'Z') {
	                result = result + (char)(ch + 32);  // ASCII conversion
	            }
	            // If lowercase -> convert to uppercase
	            else if (ch >= 'a' && ch <= 'z') {
	                result = result + (char)(ch - 32);
	            }
	            // If not a letter, keep as it is
	            else {
	                result = result + ch;
	            }
	        }

	        System.out.println("Converted string: " + result);

	        sc.close();
	    }
	

}
