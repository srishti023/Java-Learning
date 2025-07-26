// PATTERN :

// E 
// D E
// C D E
// B C D E
// A B C D E

public class pattern30 {
    public static void main(String[] args) {
        patternn30(5);
    }
    static void patternn30(int n)
    {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('E' - i); // starting character in each row
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
    }
}
