package ForLoopstring;
import java.util.Scanner;
public class FirstNonRepeatingChar {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        char result = '\0';  // null character (no result initially)

	        // Outer loop: pick each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;

	            // Inner loop: count frequency of str.charAt(i)
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                }
	            }

	            // If count == 1, it's non-repeating → break
	            if (count == 1) {
	                result = ch;
	                break;
	            }
	        }

	        if (result != '\0') {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }

	        sc.close();
	    }
	


}
