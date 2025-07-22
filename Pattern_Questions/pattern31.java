// PATTERN :

// a 
// B c
// D e F
// g H i J
// k L m N o

public class pattern31 {
    public static void main(String[] args) {
        patternn31(5);
    }
    static void patternn31(int rows)
    {
        char ch = 'a';
        boolean upper = false;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (upper) {
                    System.out.print(Character.toUpperCase(ch) + " ");
                } else {
                    System.out.print(Character.toLowerCase(ch) + " ");
                }
                ch++;
                upper = !upper; // toggle case
            }
            System.out.println();
        }
    }
}
