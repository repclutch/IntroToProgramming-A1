 

import java.util.Scanner;

public class Exercise2_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble(); //user input
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble(); //user input
		
		double weightInKilograms = weight * 0.45359237; //formula
		
		double heightInMeters = height * 0.0254; //formula
		
		double BMI = weightInKilograms / (heightInMeters * heightInMeters); //formula
		
		System.out.println("BMI is " + BMI); //formula
		
	}

}
