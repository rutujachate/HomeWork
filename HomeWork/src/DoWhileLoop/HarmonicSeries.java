package DoWhileLoop;
import java.util.Scanner;
public class HarmonicSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = 1;
	        double sum = 0.0;

	        do {
	            sum += 1.0 / i; // add reciprocal
	            i++;
	        } while (i <= n);

	        System.out.println("Sum of series up to 1/" + n + " = " + sum);

	        sc.close();
	    }
	

}
