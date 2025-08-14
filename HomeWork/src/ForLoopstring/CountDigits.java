package ForLoopstring;
import java.util.Scanner;
public class CountDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int count = 0;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if character is a digit
	            if (ch >= '0' && ch <= '9') {
	                count++;
	            }
	        }

	        System.out.println("Number of digits in the string: " + count);

	        sc.close();
	    }
	

}
