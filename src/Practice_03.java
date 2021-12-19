public class Practice_03 {
    public static void main(String[] args) {
        byte a = 13;
        int b = 398;

        int addition = a + b; // add
        int subtraction = addition - 50; // subtract

        double multiplication = subtraction * 15.5D; // multiply
        double division = multiplication / 5.33F; // divided

        double remainder = multiplication % 2; // remainder

        System.out.println("Addition Total: " + addition);
        System.out.println("Subtraction Total: " + subtraction);
        System.out.println("Multiplication Total: " + multiplication);
        System.out.println("DDivision Total " + division);
        System.out.println("Remainder Total: " + remainder);

        addition++; // addition = addition + 1
        System.out.println("Increment: " + addition);

        addition--; // addition = addition - 1
        System.out.println("Decrement: " + addition);

        addition += 20; // addition = addition + 20
        System.out.println("Add 20 more: " + addition);

        addition -= 10; // addition = addition - 10
        System.out.println("Take Away 10: " + addition);

        addition /= 10; // addition = addition / 10
        System.out.println("Divided By 10: " + addition);

        addition *= 2; // addition = addition * 2
        System.out.println("Multiply By 2: " + addition);

        addition %= 2; // addition = addition % 2
        System.out.println("Remainder By 2: " + addition);
    }
}
