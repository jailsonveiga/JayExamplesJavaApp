public class Practice_04 {
    public static void main(String[] args) {
        System.out.println("Relationship Operators:");

        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println("My boolTrue is it? " + boolTrue + " - Yes");
        System.out.println("My boolFalse is it? " + boolFalse + " - Yes");

        System.out.println("------------------------");

        int myAge = 25;
        int yourAge = 18;

        boolean checkAge = myAge < yourAge;

        System.out.println("Is it myAge less Then yourAge? " + "- " + checkAge);

        checkAge = myAge > yourAge;
        System.out.println("Is it myAge greater Then yourAge? " + "- " + checkAge);

        checkAge = yourAge <= myAge;
        System.out.println("Is it yourAge less or the same as myAge? " + "- " + checkAge);

        checkAge = yourAge >= myAge;
        System.out.println("Is it yourAge greater  or same as myAge? " + "- " + checkAge);


        System.out.println("------------------------");

        String myName = "Jay";
        String yourName = "Jay";
        boolean nameCheck = myName.equals(yourName);
        boolean nameCheckNotEqual = myName != yourName;

        System.out.println("Is it myName same as yourName? " + "- " + nameCheck);
        System.out.println("Is it myName not the same as yourName? " + "- " + nameCheckNotEqual);
    }
}
