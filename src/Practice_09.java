//Switch Statements

import java.util.Scanner;

public class Practice_09 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        char grade;

        System.out.println("Please Enter Your grade");
        grade = userInput.next().charAt(0);

        switch (grade) {
            case 'A', 'a' -> System.out.println("Excellent Job");
            case 'B', 'b' -> System.out.println("Good Job");
            case 'C', 'c' -> System.out.println("You can do better");
            case 'D', 'd' -> System.out.println("You are getting close to fail");
            case 'F', 'f' -> System.out.println("You are failing");
            default -> System.out.println("No grade at this time");
        }
    }
}
