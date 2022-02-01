//Julia Ybanez
//CS1400
// Midterm Problem 1 - Divisible

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //variable delclarations
        int numberOne;
        int numberTwo;
        int remainder;

        //program instructions
        System.out.println("This program will tell you if the first number is evenly divisible by the second number.");
        System.out.print("Enter the first number: ");
        numberOne = keyboard.nextInt(); //user number input for first number
        System.out.print("Enter the second number: ");
        numberTwo = keyboard.nextInt(); //user number input for second number

        //if..else if statement
        if (numberOne % numberTwo == 0) //checks to see if the 1st number is evenly divisible by the second number.
        {
            //output message to state they are evenly divisible and there is no remainder.
            System.out.print("These numbers are easily divisible.");
        }
        else if (numberOne % numberTwo != 0)
        {
            //remainder calculations
            remainder = numberOne % numberTwo;
            //output message to state there is a remainder.
            System.out.print("Your remainder is " + remainder);
        }
    }
}