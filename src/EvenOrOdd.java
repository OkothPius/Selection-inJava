import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);

        //input a integer number
        System.out.print("Enter a number:");
        int num = input.nextInt();

        //Output even or odd number
        System.out.println(num % 2 == 0 ? "Even number" : "Odd number");
    }
}
