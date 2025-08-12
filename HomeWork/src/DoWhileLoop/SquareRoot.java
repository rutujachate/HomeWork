package DoWhileLoop;
import java.util.Scanner;
public class SquareRoot {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        
	        int i = 1; // start number
	        
	        do {
	            System.out.println("Square of " + i + " = " + (i * i));
	            i++;
	        } while (i <= n); // loop until i reaches n
	        
	        sc.close();
	    }
	

}
