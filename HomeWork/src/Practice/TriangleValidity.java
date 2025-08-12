package Practice;
import java.util.Scanner;

public class TriangleValidity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Firts angle of triangle:");
		int angle1= scanner.nextInt();
		
		System.out.println("Enter the Second angle of triangle:");
		int angle2= scanner.nextInt();
		
		System.out.println("Enter the third angle of triangle:");
		int angle3= scanner.nextInt();
		
		if(angle1>0 && angle2>0 && angle3>0) {
			int sum =angle1 + angle2 + angle3;
			if(sum==180) {
			System.out.println("Its a valid triangle.");
			
		}
		else {
			System.out.println("Its a not a valid triangle.");
		}
	
	}else {
		System.out.println(" Angles must be greater than 0");
	}
	
	System.out.println("Sum of angles of triangle is: " );

    scanner.close();
			

}
}

