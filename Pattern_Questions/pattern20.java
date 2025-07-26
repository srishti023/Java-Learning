// PATTERN :

// ****
// *  *
// *  *
// *  *
// ****

public class pattern20 {
    public static void main(String[] args) {
        patternn20(5,4);
    }

    static void patternn20(int row, int col) {
        int rows = row; // Total number of rows
        int cols = col; // Total number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print star on the border
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
