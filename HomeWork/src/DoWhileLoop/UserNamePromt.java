package DoWhileLoop;
import java.util.Scanner;
public class UserNamePromt {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String username;

	        do {
	            System.out.print("Enter username: ");
	            username = sc.nextLine();

	            if (!username.equals("admin")) {
	                System.out.println("Incorrect username. Please try again.");
	            }
	        } while (!username.equals("admin"));

	        System.out.println("Welcome, admin!");

	        sc.close();
	    }
	


}
