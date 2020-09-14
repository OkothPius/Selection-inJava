/*Created by Oruko Pius
/* with the help of introduction to java programming by Y daniel Liang
 */

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //The constants
        final double KG = 0.45359237;
        final double MTR = 0.0254;

        //create Scanner
        Scanner input = new Scanner(System.in);

        //Enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Enter height in inches
        System.out.print("Enter height in Inches: ");
        double height = input.nextDouble();

        double BodyMass = weight * KG / ((height * MTR) * (height * MTR));

        //Check for all BMIs
        System.out.println("Your BMI is " + BodyMass);
        if (BodyMass < 18.5)
            System.out.println("You are underweight.");
        else if (BodyMass <= 25 )
            System.out.println("You are normal weight.");
        else if (BodyMass <= 30 )
            System.out.println("You are overweight.");
        else {
            System.out.println("You are obese.");
        }

    }
}
