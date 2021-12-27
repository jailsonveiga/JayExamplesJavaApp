// Random Numbers

import java.util.Random;

public class Practice_12 {
    public static void main(String[] args) {
        Random random = new Random();

        int diceNum;

        for(int i = 0; i < 10; i++) {
            diceNum = random.nextInt(6) + 1;
            System.out.print(diceNum + "\t");
        }

    }
}
