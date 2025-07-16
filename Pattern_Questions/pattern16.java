package Pattern_Questions;
public class pattern16 {
    public static void main(String[] args) {
        patternn16(5);
    }
    static int nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }

    static void patternn16(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // double space for alignment
            }

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + "   ");
            }

            System.out.println();
        }
    }
}
