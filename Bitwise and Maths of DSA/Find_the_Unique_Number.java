public class Find_the_Unique_Number {
    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR cancels out duplicate numbers
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Unique number: " + findUnique(arr)); // Output: 2
    }
}
