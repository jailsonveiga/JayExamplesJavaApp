package basic_actions_with_arrays;

public class ArraysExample8 {
    public static void main(String[] args) {
        // Quick (static) initialization. Add up the array elements

        // Static initialization
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        // Calculate the sum
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];

            System.out.println("Sum is " + sum);
        }
    }
}
