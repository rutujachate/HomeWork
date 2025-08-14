package DoWhileLoop;
import java.util.Scanner;
public class NumberLock {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        final int PIN = 1234;  // fixed 4-digit PIN
	        int enteredPin;

	        do {
	            System.out.print("Enter 4-digit PIN: ");
	            enteredPin = sc.nextInt();

	            if (enteredPin != PIN) {
	                System.out.println("❌ Incorrect PIN. Try again.");
	            }
	        } while (enteredPin != PIN);

	        System.out.println("✅ Access Granted! Welcome!");
	        sc.close();
	    }
	

}
