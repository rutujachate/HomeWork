package ForLoopstring;
import java.util.Scanner;
public class ShiftCharacters {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Shift letters and digits; leave other characters unchanged
	            if ((ch >= 'a' && ch <= 'y') || (ch >= 'A' && ch <= 'Y') || (ch >= '0' && ch <= '8')) {
	                result = result + (char)(ch + 1);
	            } 
	            // Wrap around for 'z', 'Z', '9'
	            else if (ch == 'z') {
	                result = result + 'a';
	            } 
	            else if (ch == 'Z') {
	                result = result + 'A';
	            }
	            else if (ch == '9') {
	                result = result + '0';
	            }
	            else {
	                result = result + ch; // Leave other characters unchanged
	            }
	        }

	        System.out.println("Shifted string: " + result);

	        sc.close();
	    }
	


}
