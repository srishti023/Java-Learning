public class rightmost_set_bit_of_a_number {
    public static int rightmostSetBitPosition(int num) {
        if (num == 0) return -1; // No set bit
        
        int position = 0;
        while ((num & 1) == 0) {
            num = num >> 1;
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println("Rightmost set bit of 18: " + rightmostSetBitPosition(18)); // 1
        System.out.println("Rightmost set bit of 12: " + rightmostSetBitPosition(12)); // 2
        System.out.println("Rightmost set bit of 0: " + rightmostSetBitPosition(0));   // -1
    }
}
