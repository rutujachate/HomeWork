package Practice;
import java.util.Scanner;

public class OddDiffrence {
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		//input two integers
		System.out.println("Enter the Firts integer:");
		int a= scanner.nextInt();
		
		System.out.println("Enter the Second integer:");
		int b= scanner.nextInt();
		
		if (a % 2 != 0 && b % 2 != 0) {
			 int diff = Math.abs(a - b);
	            System.out.println("Absolute difference: " + diff);
		}else {
			System.out.println("Invalid");
			
		}
		scanner.close();
	}

}
