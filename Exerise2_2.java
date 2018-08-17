 

import java.util.Scanner;

public class Exerise2_2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double radius;
		double length;
		
		System.out.println("Enter radius ");
		radius= input.nextDouble();
		
		System.out.println("Enter Legnth ");
		length = input.nextDouble();
		
		double area = radius*radius*Math.PI;
		double volume = area*length;
		
		System.out.println("the area is " + area + " & the volume is " + volume);
	
		
		
	}

}
