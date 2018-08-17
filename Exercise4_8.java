import java.util.Scanner;

public class Exercise4_8 {
    
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        
        int character;
        
        System.out.println("Enter an ASCII code: ");
        character = input.nextInt();
        
        if (character < 0 || character > 127) {
            System.out.println("Please enter a number between 0-127.");
        } //or 
            else {
            System.out.println("The character for ASCII code " + character + " is " + (char)character);
        }
    }

}
