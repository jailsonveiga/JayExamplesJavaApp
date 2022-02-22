package basic_actions_with_arrays;

public class ArrayExample7 {
    public static void main(String[] args) {
        // Display an array on the screen

        int[] list = new int[10];

        // Fill the array
        for(int i = 0; i < list.length; i++) {
            list[i] = i;

            // Display the contents of the array
            System.out.println(list[i]);
        }
    }
}
