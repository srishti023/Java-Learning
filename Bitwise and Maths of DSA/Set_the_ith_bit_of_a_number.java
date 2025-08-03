public class Set_the_ith_bit_of_a_number {
    public static int setIthBit(int num, int i) {
        return num | (1 << i); // Bitwise OR to set the ith bit
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Set 1st bit of " + num + ": " + setIthBit(num, 1)); // 10
        System.out.println("Set 0th bit of " + num + ": " + setIthBit(num, 0)); // 11

        num = 8;
        System.out.println("Set 2nd bit of " + num + ": " + setIthBit(num, 2)); // 12
    }
}
