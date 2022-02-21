package basic_actions_with_arrays;

import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
       // Read 10 strings from the Keyboard

        String[] list = new String[10];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 10 Strings");

        for(int i = 0; i < list.length; i++) {
            list[i] = keyboard.nextLine();
        }
    }
}
