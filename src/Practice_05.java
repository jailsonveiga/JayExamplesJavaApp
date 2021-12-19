public class Practice_05 {
    public static void main(String[] args) {
        boolean isSnow = true;
        boolean isHot = true;
        boolean isRain = false;

        boolean checkTemp = isSnow && isHot; // both condition need to be true
        System.out.println("It is Snowing and it is Hot outside? " + "- " + checkTemp);

        checkTemp = isSnow || isRain; // one of the condition need to be true
        System.out.println("Is it Snow or is it Hot? " + "- " + checkTemp + "- " + " it's Snowing");

        checkTemp = !isSnow; // flip the value
        System.out.println("Is it Snow? " + "- " + checkTemp);
    }
}
