package DoWhileLoop;

public class First10DivBy9 {
		    public static void main(String[] args) {
	        int count = 0;
	        int num = 9; // First number divisible by 9

	        do {
	            System.out.println(num);
	            num += 9; // Next number divisible by 9
	            count++;
	        } while (count < 10);
	    }
	

}
