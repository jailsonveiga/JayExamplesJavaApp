package basic_actions_with_arrays;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        // Read 10 numbers from the keyboard

        int[] numbers = new int[10];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 10 numbers");

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = keyboard.nextInt();
        }
    }
}
