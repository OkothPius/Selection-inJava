import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //Obtain three numbers
        System.out.println("Enter 3 numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        //Output the result
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    }
}
