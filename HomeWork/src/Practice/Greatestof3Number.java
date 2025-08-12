package Practice;
import java.util.Scanner;

public class Greatestof3Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Firts integer:");
		int a= scanner.nextInt();
		
		System.out.println("Enter the Second integer:");
		int b= scanner.nextInt();
		
		System.out.println("Enter the Firts integer:");
		int c= scanner.nextInt();
		
		int biggest;
		
		if (a > b) {
			if(a>c) {
				 biggest =a;				
			}else {
				 biggest=c;
			}
		}else {
				if(b>c) {
					 biggest=b;
					
				}else {
					
						 biggest=c;
						
					
				}
				
			}
		System.out.println("The greatest number is: " + biggest);

        scanner.close();
				
		}
		
		
		
		
	}


