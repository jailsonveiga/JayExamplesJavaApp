package basic_actions_with_arrays;

public class ArraysExample3 {
    public static void main(String[] args) {
        // Fill a 10-element array with number from 0 to 9:

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}
