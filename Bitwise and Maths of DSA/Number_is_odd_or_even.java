public class Number_is_odd_or_even {
    public static boolean isEven(int num) {
        return (num & 1) == 0; // Last bit 0 → even, 1 → odd
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + " is " + (isEven(num1) ? "Even" : "Odd")); // Odd
        System.out.println(num2 + " is " + (isEven(num2) ? "Even" : "Odd")); // Even
    }
}
