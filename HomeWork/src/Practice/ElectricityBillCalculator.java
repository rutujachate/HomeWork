package Practice;
import java.util.Scanner;

	public class ElectricityBillCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input total units consumed
	        System.out.print("Enter total units consumed: ");
	        int units = scanner.nextInt();
	        int cost;

	        // Check and calculate using nested if-else
	        if (units >= 0) {
	            if (units <= 100) {
	                cost = units * 5;
	            } else {
	                if (units <= 300) {
	                    cost = units * 7;
	                } else {
	                    cost = units * 10;
	                }
	            }
	            System.out.println("Electricity Bill: ₹" + cost);
	        } else {
	            System.out.println("Invalid input! Units cannot be negative.");
	        }

	        scanner.close();
	    }
	}


