package ForLoopstring;
import java.util.Scanner;
public class Palinedrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        boolean isPalindrome = true;

	        // Compare characters from start and end
	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
	                isPalindrome = false;
	                break; // No need to check further
	            }
	        }

	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        sc.close();
	    }
	

}
