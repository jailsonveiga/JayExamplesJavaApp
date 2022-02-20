package basic_actions_with_arrays;

public class ArraysExample2 {
    public static void main(String[] args) {
        // Fill a 10-element array with numbers from 10 t0 1

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 - i;
            System.out.println(numbers[i]);
        }
    }
}
