package Practice;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (age >= 0) {
            if (age <= 12) {
                System.out.println("Category: Child");
            } else if (age <= 17) {
                System.out.println("Category: Teen");
            } else if (age <= 59) {
                System.out.println("Category: Adult");
            } else {
                System.out.println("Category: Senior");
            }
        } else {
            System.out.println("Invalid age! Please enter a non-negative value.");
        }

        scanner.close();
	}

}
