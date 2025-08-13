package DoWhileLoop;
import java.util.Scanner;
public class ChechevennReverse {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int reversed = 0;
	        int temp = Math.abs(num); // handle negative numbers

	        // Reverse the number using do-while
	        do {
	            int digit = temp % 10;
	            reversed = reversed * 10 + digit;
	            temp /= 10;
	        } while (temp > 0);

	        System.out.println("Reversed number: " + reversed);

	        if (reversed % 2 == 0) {
	            System.out.println("The reversed number is even ✅");
	        } else {
	            System.out.println("The reversed number is odd ❌");
	        }

	        sc.close();
	    
	}

}
