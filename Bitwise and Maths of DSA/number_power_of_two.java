public class number_power_of_two {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if:
        // 1. It is greater than 0
        // 2. It has exactly one bit set in binary representation
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(num + " is power of 2? " + isPowerOfTwo(num)); // true

        num = 10;
        System.out.println(num + " is power of 2? " + isPowerOfTwo(num)); // false

        num = 1;
        System.out.println(num + " is power of 2? " + isPowerOfTwo(num)); // true
    }
}
