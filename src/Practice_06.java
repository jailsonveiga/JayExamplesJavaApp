import java.util.Scanner;

public class Practice_06 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = userInput.nextLine();

        System.out.println("What's your age?");
        int age = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Where do you live?");
        String live = userInput.nextLine();

        System.out.println("Hello, " + name.toUpperCase());
        System.out.println("Your age is: " + age);
        System.out.println("And you live in: " + live.toUpperCase());

    }
}

