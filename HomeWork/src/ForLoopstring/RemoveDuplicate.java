package ForLoopstring;
import java.util.Scanner;
public class RemoveDuplicate {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if this char already exists in result
	            boolean found = false;
	            for (int j = 0; j < result.length(); j++) {
	                if (result.charAt(j) == ch) {
	                    found = true;
	                    break;
	                }
	            }

	            // If not found, add to result
	            if (!found) {
	                result = result + ch;
	            }
	        }

	        System.out.println("String after removing duplicates: " + result);

	        sc.close();
	    }
	

}
