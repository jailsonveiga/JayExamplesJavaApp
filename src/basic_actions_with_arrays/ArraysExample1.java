package basic_actions_with_arrays;

public class ArraysExample1 {
    public static void main(String[] args) {
        // Fill a 10 element array with numbers from 1 to 10

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}
