package Practice;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 sides
        System.out.print("Enter side 1: ");
        int a = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int b = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int c = scanner.nextInt();

        // Check if it's a valid triangle
        if (a + b > c && b + c > a && c + a > b) {
            // Classify the triangle
            if (a == b && b == c) {
                System.out.println("It is an Equilateral triangle.");
            } else if (a == b || b == c || c == a) {
                System.out.println("It is an Isosceles triangle.");
            } else {
                System.out.println("It is a Scalene triangle.");
            }
        } else {
            System.out.println("Not a valid triangle.");
        }

        scanner.close();
    }
}


