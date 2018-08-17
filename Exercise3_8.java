import java.util.Scanner;

public class Exercise3_8 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Enter three integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		int temp;
		
		if (num2 < num1 || num3 < num1) {
			
			if (num2 < num1) {
				
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			if (num3 < num1) {
				
				temp = num1;
				num1 = num3;
				num3 = temp;
				
			}
			
			if (num3 < num2) {
				
				temp = num2;
				num2 = num3;
				num3 = temp;
				
			}
		}
		
		System.out.println("The integers in non-decreasing order are: " + num1 + " " + num2 + " " + num3);
		
	}
}
