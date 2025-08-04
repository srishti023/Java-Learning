public class clear_ith_bit_number {
    public static int clearIthBit(int num, int i) {
        return num & ~(1 << i); // AND with negated mask
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Clear 1st bit of " + num + ": " + clearIthBit(num, 1)); // 8
        System.out.println("Clear 3rd bit of " + num + ": " + clearIthBit(num, 3)); // 2

        num = 15;
        System.out.println("Clear 0th bit of " + num + ": " + clearIthBit(num, 0)); // 14
    }
}
