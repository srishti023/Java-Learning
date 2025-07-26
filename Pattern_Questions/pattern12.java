
public class pattern12 {
    public static void main(String[] args) {
        patternn12(5);
    }
    static void patternn12(int n)
    {
        for(int i=1; i<=n ; i++)
        {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }
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
