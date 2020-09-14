import java.util.Scanner;

public class SubtractQuiz {
    public static void main(String[] args){
        //Generate two random two single digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //if number1 < number2 swap number1 with number2
        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //Prompt the student to answer "what is number 1 - number2 ?"
        System.out.print("What is " + number1 + "- " + number2 + " ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //Gradde the answer and dispaly the results
        if ((number1 - number2) == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("You are wrong");
            System.out.println(number1 + " - " + number2 + " Should be " + (number1 - number2));
        }

    }
}
