public class pattern23 {
    public static void main(String[] args) {
        patterrnn23(3);
    }
    static void patterrnn23(int n)
    {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < (n - i - 1) * 2; j++) {
                System.out.print(" ");
            }

            // Print stars with spaces in between
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

                if (j < i) {
                    int spaces = 4; // space between stars
                    for (int s = 0; s < spaces; s++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
