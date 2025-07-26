// PATTERN :

// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

public class pattern24 {
    public static void main(String[] args) {
        patternn24(11);
    }
    static void patternn24(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1) {
                    // First and last column
                    System.out.print("*");
                }
                else if (i <= n / 2 && (j == i || j == n - 1 - i)) {
                    // Upper diagonals
                    System.out.print("*");
                }
                else if (i > n / 2 && (j == i || j == n - 1 - i)) {
                    // Lower diagonals
                    System.out.print("*");
                }
                else {
                    // Spaces
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
