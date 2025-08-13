package DoWhileLoop;
import java.util.Scanner;
public class MenuRepeat {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n=== MENU ===");
	            System.out.println("1. Say Hello");
	            System.out.println("2. Display Date");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Hello! Have a great day! 😊");
	                    break;
	                case 2:
	                    System.out.println("Today's date is: " + java.time.LocalDate.now());
	                    break;
	                case 3:
	                    System.out.println("Exiting the program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        } while (choice != 3);

	        sc.close();
	    }
	

}
