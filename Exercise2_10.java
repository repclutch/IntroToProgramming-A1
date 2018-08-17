//This program takes the users temperatures and then outputs the energy needed to get it to the last temperature

import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter the amount of water in kilograms: ");
		double M = input.nextDouble();
		
		
		System.out.println("Enter the inital temperature: ");
		double firstTemperature = input.nextDouble();
		
		
		System.out.println("Enter the final temperature: ");
		double lastTemperature = input.nextDouble();
		
		double Q = M * (firstTemperature - lastTemperature) * 4184;
		System.out.println("The energy needed is " + Q);
		


		//In this program the double is written first to help me analyze what is being done behind the scenes and being
		//displayed by the console at end
	}

}
