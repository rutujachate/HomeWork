package Practice;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Firts integer:");
		double num1=scanner.nextDouble();
		
		System.out.println("Enter the Second integer:");
		double num2=scanner.nextDouble();
		
		
		System.out.println("Choose an operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3: Multiply");
		System.out.println("4. Division");
		System.out.println("Enter your choice(1-4)");
		int choice = scanner.nextInt();
		
		 if (choice == 1) {
			 System.out.println("Result of Addition:" +(num1 + num2));
		 }else {
			 if (choice == 2) {
				 System.out.println("Result of Subtraction:" +(num1 - num2));
			 }else
				 if (choice == 3) {
					 System.out.println("Result of Multiply :" +(num1 * num2));
				 }else
					 if (choice == 4) {
						 if (num2 != 0) {
						 System.out.println("Result of Division:" +(num1 / num2));
					 }else {
                         System.out.println("Error: Division by zero is not allowed.");
                     }
			 
					 }else {
	                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
	                    }
		 }
		
		
		
		 scanner.close();
	}

}
