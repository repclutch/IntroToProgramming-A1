 //This program will convert Celsius to Faherenheit

import java.util.Scanner;

public class Exercise2_1 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double celsius;
		
		double fahrenheit; //Remember this is double because it is not a whole number
		
		System.out.println("Enter a degree in Celsius: "); //This is where user input goes
		celsius = input.nextDouble();
		
        fahrenheit = (9.0 / 5) * celsius + 32; //this is the formula to convert
        
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		//Above is the output that the console will report when converting
	}

}
