import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int Number1 = input.nextInt();

        if (Number1 % 5 == 0)
            System.out.println("HI FIVE");

        if (Number1 % 2 == 0)
            System.out.println("HI EVEN");

    }
}
