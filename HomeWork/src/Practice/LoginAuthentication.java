package Practice;
import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        // Input username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check authentication
        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied");
            }
        } else {
            System.out.println("Access Denied");
        }

        scanner.close();
    }
}

