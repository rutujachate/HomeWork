package DoWhileLoop;
import java.util.Scanner;
public class SumNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = 1;
	        int sum = 0;

	        do {
	            sum += i; // add i to sum
	            i++;
	        } while (i <= n);

	        System.out.println("Sum from 1 to " + n + " = " + sum);

	        sc.close();
	    }
	

}
