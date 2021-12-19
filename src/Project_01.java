import java.util.Scanner;

public class Project_01 {
    public static void main(String[] args) {

        System.out.println("Please Enter 3 Numbers:");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter First Number And Then Press Enter: ");
        double userInputNum1 = userInput.nextDouble(); // get user input

        System.out.println("Enter Second Number And Then Press Enter: ");
        double userInputNum2 = userInput.nextDouble(); // get user input

        System.out.println("Enter Third number And Then Press Enter: ");
        double userInputNum3 = userInput.nextDouble(); // get user input

        double userNumTotal = (userInputNum1 + userInputNum2 + userInputNum3) / 3.0; // add all the 3 numbers from the user input and then divided by 3.0

        System.out.println("The Average is: " + userNumTotal);

    }
}
