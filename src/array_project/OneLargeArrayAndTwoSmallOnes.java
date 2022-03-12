package array_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneLargeArrayAndTwoSmallOnes {
    public static void main(String[] args) throws IOException {
        // To read input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Creating array of 20 numbers
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        // Create two arrays of 10 number each
        int[] array1 = new int[10];

        int[] array2 = new int[10];

        // Copy the large array into the two small ones
        for(int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
            System.out.println(array1[i]);
        }
    }
}
