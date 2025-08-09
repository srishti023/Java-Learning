public class Count_Bits_Needed_to_Convert_One_Number_to_Another {
    public static int countBitsToConvert(int a, int b) {
        int xor = a ^ b; // Bits that differ will be 1 in XOR
        int count = 0;
        
        while (xor != 0) {
            count += xor & 1; // Count the set bit
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 7, b = 10;
        System.out.println("Bits to change from " + a + " to " + b + ": " + countBitsToConvert(a, b)); // 3
        
        a = 10; b = 20;
        System.out.println("Bits to change from " + a + " to " + b + ": " + countBitsToConvert(a, b)); // 4
    }
}
