// PATTERN :

//     *
//    * *
//   * * *
//  * * * *
// * * * * *

public class pattern10 {
    public static void main(String[] args) {
        patternn10(5);
    }
    static void patternn10(int n)
    {
        for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
