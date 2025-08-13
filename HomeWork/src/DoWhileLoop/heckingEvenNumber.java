package DoWhileLoop;
import java.util.Scanner;
public class heckingEvenNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        do {
	            System.out.print("Enter a number: ");
	            num = sc.nextInt();

	            if (num % 2 != 0) {
	                System.out.println(num + " is odd. Try again!");
	            }
	        } while (num % 2 != 0);

	        System.out.println(num + " is even! ✅");
	        sc.close();
	    }
	

}
