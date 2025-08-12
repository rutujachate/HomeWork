package DoWhileLoop;
import java.util.Scanner;
public class NoMulof5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = 1;

	        do {
	            if (i % 5 != 0) { // skip multiples of 5
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= n);

	        sc.close();
	    }
	

}
