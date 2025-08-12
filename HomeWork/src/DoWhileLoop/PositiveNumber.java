package DoWhileLoop;
import java.util.Scanner;
public class PositiveNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a positive number: ");
	            num = sc.nextInt();

	            if (num <= 0) {
	                System.out.println("That's not a positive number. Please try again.");
	            }
	        } while (num <= 0);

	        System.out.println("Thank you! You entered: " + num);

	        sc.close();
	    }
	


}
