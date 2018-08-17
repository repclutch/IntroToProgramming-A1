
import java.util.Scanner;

public class Exercise2_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num;
		
		System.out.println("Enter a number between 0 and 1000");
		num = input.nextInt();
		
		int firstNumber = num % 10;
		num = num / 10;
		
		int secondNumber = num % 10;
		num = num / 10;
		
		int sum = secondNumber + firstNumber + num;
		
		System.out.println("The sum of the digits is " + sum);
		
		
		
		
	}

}
