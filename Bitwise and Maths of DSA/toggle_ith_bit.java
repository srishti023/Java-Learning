public class toggle_ith_bit {
    public static int toggleIthBit(int num, int i) {
        return num ^ (1 << i); // XOR with a mask having ith bit set
    }

    public static void main(String[] args) {
        int num = 10; // Binary: 1010

        System.out.println("Toggle 1st bit of " + num + ": " + toggleIthBit(num, 1)); // 8
        System.out.println("Toggle 3rd bit of " + num + ": " + toggleIthBit(num, 3)); // 2
    }
}
