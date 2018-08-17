import java.util.Scanner;

public class Exercise3_12 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number;
		
		System.out.println("Enter a three-digit integer: ");
		number = input.nextInt();
		
		int firstNum = number / 100;
		int lastNum = number % 10;
		
		if(lastNum == firstNum) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome");
		}
		
	}

}
