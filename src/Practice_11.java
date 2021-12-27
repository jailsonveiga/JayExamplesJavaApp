// Continue and Break Statements

public class Practice_11 {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {

            if(count % 2 != 0) {
                count++;
                continue;
            }
            System.out.print(count + "\t");
            count++;
        }
        }
    }

