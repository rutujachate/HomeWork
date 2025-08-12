package DoWhileLoop;
import java.util.Scanner;
public class NumberGreaterthan100 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a number greater than 100: ");
	            num = sc.nextInt();

	            if (num <= 100) {
	                System.out.println("Number must be greater than 100. Please try again.");
	            }
	        } while (num <= 100);

	        System.out.println("Thank you! You entered: " + num);

	        sc.close();
	    }
	


}
