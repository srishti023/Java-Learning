public class CountSetBits {
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // clears the lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println("Set bits in " + num + " = " + countSetBit(num)); // 2

        num = 15;
        System.out.println("Set bits in " + num + " = " + countSetBit(num)); // 4

        num = 0;
        System.out.println("Set bits in " + num + " = " + countSetBit(num)); // 0
    }
}
