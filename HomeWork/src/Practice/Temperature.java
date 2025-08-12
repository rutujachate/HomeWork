package Practice;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();

        // Input unit (C/F)
        System.out.print("Enter unit (C/F): ");
        char unit = scanner.next().charAt(0);

        // Convert temperature based on unit
        if (unit == 'C' || unit == 'c') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        } else if (unit == 'F' || unit == 'f') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius + "°C");
        } else {
            System.out.println("Invalid unit! Please enter C or F.");
        }

        scanner.close();
    }
}


