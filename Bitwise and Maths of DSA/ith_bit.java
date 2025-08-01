public class ith_bit {
    public static boolean isIthBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("Is 0th bit set in " + num + "? " + isIthBitSet(num, 0)); // true
        System.out.println("Is 1st bit set in " + num + "? " + isIthBitSet(num, 1)); // false
        System.out.println("Is 2nd bit set in " + num + "? " + isIthBitSet(num, 2)); // true
    }
}
