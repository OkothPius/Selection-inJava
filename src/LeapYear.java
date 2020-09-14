import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //Enter any year
        System.out.print("Enter any year in integer: ");
        int year = input.nextInt();

        //Check if the year is leap year or not
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Display results
        System.out.println("Is " + year + " a leap year? " + isLeapYear );
    }
}
