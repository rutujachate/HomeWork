package DoWhileLoop;
import java.util.Scanner;
public class StsrtPattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        int i = 1; // outer loop for rows

	        do {
	            int j = 1; // inner loop for stars
	            do {
	                System.out.print("*");
	                j++;
	            } while (j <= i);
	            
	            System.out.println(); // move to next line
	            i++;
	        } while (i <= rows);

	        sc.close();
	    }
	

}
