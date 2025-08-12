package Practice;
import java.util.Scanner;

public class IntegerCheck {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the integer:");
		double a=scanner.nextDouble();
		
		if(a>0) {
			System.out.println("The integer you have entered is Positive.");
		}else if(a<0) {
			System.out.println("The integer you have entered is Negtive.");
		}
		else {
			System.out.println("The integer you have entered is Zero.");
		}
		scanner.close();
		
	}

}
