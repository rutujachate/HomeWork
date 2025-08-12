package Practice;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("Enter the year to check if its leap year or not :");
		int year= scanner.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
				 System.out.println(year +"is leap year.");					
					
				}else {
					System.out.println(year +"not a leap year.");
				}
			}else {
				System.out.println(year +"is leap year.");
			}
		}
		else {
			System.out.println(year +"not a leap year.");
			
		}

	    

	    scanner.close();
	}

}
