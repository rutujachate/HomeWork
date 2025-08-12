package Practice;
import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        char lowerCh = Character.toLowerCase(ch);

        // Check if input is a letter
        if (Character.isLetter(ch)) {
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet character.");
        }

        scanner.close();
    }
}


