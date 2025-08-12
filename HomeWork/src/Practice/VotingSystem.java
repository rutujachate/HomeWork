package Practice;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input citizenship status (Y/N)
        System.out.print("Are you a citizen? (Y/N): ");
        char citizen = scanner.next().charAt(0);

        // Check eligibility
        if (age >= 18) {
            if (citizen == 'Y' || citizen == 'y') {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote: Not a citizen.");
            }
        } else {
            System.out.println("Not eligible to vote: Age must be 18 or above.");
        }

        scanner.close();
    }
}

