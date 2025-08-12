package Practice;
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current account balance
        System.out.print("Enter your current balance: ");
        int balance = scanner.nextInt();

        // Input withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = scanner.nextInt();

        // Condition: multiple of 100 and ≤ balance
        if (withdrawal % 100 == 0) {
            if (withdrawal <= balance) {
                balance -= withdrawal;
                System.out.println("Withdrawal approved.");
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Withdrawal rejected: Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal rejected: Amount must be a multiple of 100.");
        }

        scanner.close();
    }
}


