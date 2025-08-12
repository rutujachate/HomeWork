package ForLoop;
import java.util.Scanner;
public class PalindromeNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from user
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int originalNum = num;
	        int reverse = 0;

	        // Reverse the number using for loop
	        for (; num != 0; num /= 10) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	        }

	        // Check if original number and reverse are same
	        if (originalNum == reverse) {
	            System.out.println(originalNum + " is a Palindrome.");
	        } else {
	            System.out.println(originalNum + " is NOT a Palindrome.");
	        }

	        sc.close();
	    }
	

}
