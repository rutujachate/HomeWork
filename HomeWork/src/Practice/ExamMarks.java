package Practice;
import java.util.Scanner;

public class ExamMarks {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		//input two integers
				System.out.println("Enter the Firts Subject marks:");
				int Marks1= scanner.nextInt();
				
				System.out.println("Enter the Second Subject marks:");
				int Marks2= scanner.nextInt();
				
				//input two integers
				System.out.println("Enter the third Subject marks:");
				int Marks3= scanner.nextInt();
				
				if(Marks1< 33 && Marks1< 33 && Marks1< 33) {
					System.out.println("FAIL");
					
				}else {
					System.out.println("PASS");
				}
				
			
				scanner.close();	
	}

}
