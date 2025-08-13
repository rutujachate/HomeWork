package DoWhileLoop;
import java.util.Scanner;
public class CheckPassword {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        final String CORRECT_PASSWORD = "java123";
	        String inputPassword;
	        int attempts = 0;
	        boolean success = false;

	        do {
	            System.out.print("Enter password: ");
	            inputPassword = sc.nextLine();
	            attempts++;

	            if (inputPassword.equals(CORRECT_PASSWORD)) {
	                success = true;
	                System.out.println("Access granted ✅");
	            } else {
	                System.out.println("Incorrect password ❌");
	            }
	        } while (!success && attempts < 3);

	        if (!success) {
	            System.out.println("Too many failed attempts. Access denied!");
	        }

	        sc.close();
	    }
	

}
