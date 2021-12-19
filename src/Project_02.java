import java.util.Scanner;

public class Project_02 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an Adjective? ");
        String userAdj1 = userInput.nextLine();

        System.out.println("Enter a Girl Name?");
        String userGirlName = userInput.nextLine();

        System.out.println("Enter an Adjective?");
        String userAdj2 = userInput.nextLine();

        System.out.println("Enter Occupation Name?");
        String userOcc1 = userInput.nextLine();

        System.out.println("Enter a Place Name?");
        String userPlace = userInput.nextLine();

        System.out.println("Enter Clothing Name?");
        String userClothing = userInput.nextLine();

        System.out.println("Enter Your Hobby?");
        String userHobby = userInput.nextLine();

        System.out.println("Enter an Adjective?");
        String userAdj3 = userInput.nextLine();

        System.out.println("Enter Occupation Name?");
        String userOcc2 = userInput.nextLine();

        System.out.println("Enter Boy Name?");
        String boyName = userInput.nextLine();

        System.out.println("Enter King Name?");
        String kingName = userInput.nextLine();

        System.out.println("There once was a " + userAdj1 + " girl named " + userGirlName + ", who was a " + userAdj2 + " " + userOcc1 + " girl in the Kingdom of " + userPlace + ". \nShe loved to wear " + userClothing + " and to play " + userHobby + ". \nShe want to merry the " + userAdj3 + " " + userOcc2 + " guy named " + boyName + " but her father, King " +  kingName + " forbid her from seeing him." );
    }
}
