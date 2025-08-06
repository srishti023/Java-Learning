public class Swap_two_numbers{
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b; // b = (a ^ b) ^ b = a
        a = a ^ b; // a = (a ^ b) ^ a = b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}