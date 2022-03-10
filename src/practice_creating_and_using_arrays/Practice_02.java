package practice_creating_and_using_arrays;

public class Practice_02 {
    public static void main(String[] args) {
        // Create String array with 5 elements
        String[] list = new String[5];

        // null value will be displayed
        System.out.println(list[0]);

        System.out.println("---------------------------");

        // Stores the array's length(number of elements
        System.out.println(list.length);

        System.out.println("---------------------------");

        // Assign object to array elements,
        // You need to indicate the element index in square brackets
        list[0] = "Name";

        // Print the value of the element array
        System.out.println(list[0]);

        System.out.println("---------------------------");

        // Display the values of all array elements on the screen
        for(int i = 0; i < list.length; i++) {
            System.out.println("Index " + i + " - " + list[i]);
        }
    }
}
