package Practice;
import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//input two integers
		System.out.println("Enter the Firts integer:");
		int a= scanner.nextInt();
		
		System.out.println("Enter the Second integer:");
		int b= scanner.nextInt();
		
		
		int larger = Math.max(a, b);
		int smaller = Math.min(a, b);
		
		
		//check if the larger number is even
		
		if(larger % 2 == 0) {
			System.out.println("Output :" +larger);			
			
		}else {
			System.out.println("Output :" +smaller);	
			
		}
		
		scanner.close();
	}

}
