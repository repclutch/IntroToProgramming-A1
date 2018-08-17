 

import java.util.Scanner;

public class Exercise2_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the distance to drive: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double MPG = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double PPG = input.nextDouble();
		
		double cost = distance / MPG * PPG;
		
		System.out.println("The cost of driving is $" + cost);
		
		
	}

}
