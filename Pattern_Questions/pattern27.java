// PATTERN :

// 1 2 3 4 17 18 19 20
//   5 6 7 14 15 16
//     8 9 12 13
//      10 11

public class pattern27 {
    public static void main(String[] args) {
        patternn27(4);
    }
    static void patternn27(int n)
    {
        int start = 1;
        int end = n * (n + 1); // total number of values = 20 for n=4

        for (int i = 0; i < n; i++) {
            // Print leading spaces for indentation
            for (int s = 0; s < i * 2; s++) {
                System.out.print(" ");
            }

            int count = n - i; // how many numbers in this row on left & right

            // Print left increasing numbers
            for (int j = 0; j < count; j++) {
                System.out.printf("%2d", start++);
            }

            // Calculate starting number on the right side
            int rightStart = end - count + 1;

            // Print right increasing numbers (they look like decreasing due to positioning)
            for (int j = 0; j < count; j++) {
                System.out.printf(" %2d", rightStart++);
            }

            // Decrease the end value for next row's right side
            end -= count;

            // Move to next line
            System.out.println();
        }
    }
}
