// PATTERN :
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class pattern22 {
    public static void main(String[] args) {
        patternn22(5);
    }
    static void patternn22(int n)
    {
        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 0) ? 0 : 1; // even row -> 0, odd row -> 1

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // flip 1<->0
            }

            System.out.println(); // new line after each row
        }
    }
}
