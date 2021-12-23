//Selection Control Statements / if / else if / else

import java.util.Scanner;

public class Practice_08 {
    public static void main(String[] args) {
        int age;

        Scanner userInput = new Scanner(System.in);

        System.out.println();

        System.out.println("Welcome To My Virtual Club");
        System.out.println("------------------------------------");
        System.out.println("Please Enter Your Age?");
        age = userInput.nextInt();

        if (age >= 21) {
            System.out.println("You can enter the club, and have a liquor");
        }
        else if(age >= 18) {
            System.out.println("You can enter the club but you can not have a liquor");
        }

        else{
            System.out.println("You can not enter the club or have a liquor ");
        }

        System.out.println("Thank you");
    }
}
