import java.util.Scanner;

public class PayIncrease {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //enter score
        System.out.print("Enter pay:");
        double score = input.nextDouble();

        if (score >= 90) {
            System.out.println("Increase " + score + " by 3%.");

        } else {
            System.out.println("Increase " + score + " by 1%.");
        }

    }
}
