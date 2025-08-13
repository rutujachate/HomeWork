package DoWhileLoop;
import java.util.Scanner;
public class VaildAge {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int age;

	        do {
	            System.out.print("Enter your age (1-120): ");
	            age = sc.nextInt();

	            if (age < 1 || age > 120) {
	                System.out.println("Invalid age! Please try again.");
	            }
	        } while (age < 1 || age > 120);

	        System.out.println("Valid age entered: " + age);
	        sc.close();
	    }
	

}
