package ForLoopstring;
import java.util.Scanner;
public class StringCompression {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        if (str.length() == 0) {
	            System.out.println("Compressed string: ");
	            sc.close();
	            return;
	        }

	        String result = "";
	        int count = 1;

	        // Loop through string
	        for (int i = 0; i < str.length(); i++) {
	            // Check if next character is same
	            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            } else {
	                // Append character and count
	                result = result + str.charAt(i);
	                if (count > 1) {
	                    result = result + count;
	                }
	                count = 1; // Reset count
	            }
	        }

	        System.out.println("Compressed string: " + result);

	        sc.close();
	    }
	


}
