// Repetition Control Statements

import java.util.Scanner;

public class Practice_10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNum = 0;
        int inputNum;

        System.out.println("Enter a Positive Integer Number?");
        System.out.println("Enter a Negative Integer Number To Exit?");

        inputNum = userInput.nextInt();

        while(inputNum >= 0) {
            userNum += inputNum;

            System.out.println("Enter a Positive Integer Number?");
            System.out.println("Enter a Negative Integer Number To Exit?");

            inputNum = userInput.nextInt();
        }
        System.out.println("Sum is " + userNum);
    }
}
