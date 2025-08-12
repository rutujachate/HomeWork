package DoWhileLoop;
import java.util.Scanner;
public class SumOfOddNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = 1; // first odd number
	        int sum = 0;

	        do {
	            sum += i;  // add to sum
	            i += 2;    // jump to next odd number
	        } while (i <= n);

	        System.out.println("Sum of odd numbers between 1 and " + n + " = " + sum);

	        sc.close();
	    }
	

}
