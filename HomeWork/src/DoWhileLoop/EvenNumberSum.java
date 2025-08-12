package DoWhileLoop;
import java.util.Scanner;
public class EvenNumberSum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = 2; // first even number
	        int sum = 0;

	        do {
	            sum += i; // add to sum
	            i += 2;   // jump to next even number
	        } while (i <= n);

	        System.out.println("Sum of even numbers between 1 and " + n + " = " + sum);

	        sc.close();
	    }
	

}
