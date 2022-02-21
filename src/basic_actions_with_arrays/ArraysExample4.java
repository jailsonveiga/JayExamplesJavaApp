package basic_actions_with_arrays;

public class ArraysExample4 {
    public static void main(String[] args) {
        // Fill a 10-elements array with numbers from 9 to 0

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;

            System.out.println(numbers[i]);
        }
    }
}
