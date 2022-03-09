package keyboard_input;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name?");

        String userInput = keyboard.nextLine();
        System.out.println("My name is: " + userInput);

        System.out.println("How old are you?");

        int userInputOld = keyboard.nextInt();
        System.out.println("I am: " + userInputOld + " years age");

    }
}
