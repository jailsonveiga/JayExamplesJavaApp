package practice_creating_and_using_arrays;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // Create an array of 20 numbers
        // Populate it with value from the Keyboard
        // Create two arrays of 10 numbers each
        // Copy the large array into the two small ones, half the numbers into the first small array and the second half into the second small array
        // Display the second small array, each value on a new line

        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[20];

        int[] smallArr1 = new int[10];

        int[] smallArr2 = new int[10];

        System.out.println("Enter a sequence of 20 numbers");
        int num = 0;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = keyboard.nextInt();
        }

    }
}



//    int[] array = new int[20];
//        for (int i = 0; i < 20; i++) {
//        array[i] = Integer.parseInt(reader.readLine());
//        }
//
//        int[] array1 = new int[10];
//        int[] array2 = new int[10];
//        for (int i = 0; i < 10; i++) {
//        array1[i] = array[i];
//        array2[i] = array[i + 10];
//        }
//
//        for (int i = 0; i < 10; i++) {
//        System.out.println(array2[i]);
//        }