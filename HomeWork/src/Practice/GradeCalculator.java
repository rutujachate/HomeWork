package Practice;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);		
		
		System.out.println("Enter marks (0-100): ");
		int marks= scanner.nextInt();
		
		 if (marks >= 0 && marks <= 100) {
	            if (marks >= 90) {
	                System.out.println("Grade: A");
	            } else if (marks >= 80) {
	                System.out.println("Grade: B");
	            } else if (marks >= 70) {
	                System.out.println("Grade: C");
	            } else if (marks >= 60) {
	                System.out.println("Grade: D");
	            } else {
	                System.out.println("Grade: F");
	            }
	        } else {
	            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
	        }
		 scanner.close();
	}

}
