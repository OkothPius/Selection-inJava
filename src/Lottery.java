import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        //Generates a lottery number
        int lottery = (int)( Math.random() * 100);

        //Prompts the user to enter a guess number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (Two Digits): ");
        int guess = input.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        //Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        //Check the guess
        if (guess == lottery)
            System.out.println("You matched the lottery number in the exact order. You have won $10000!");
        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
            System.out.println("You have matched all digits in the lottery number. You have won $3000!");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1)
            System.out.println("Matched one digit: You have won $1000.");
        else {
            System.out.println("Sorry no match");
        }

    }
}
