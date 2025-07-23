// PATTERN :

// E D C B A 
// D C B A   
// C B A   
// B A     
// A

public class pattern32 {
    public static void main(String[] args) {
        patternn32(5);
    }
    static void patternn32(int n)
    {
        for (int i = 0; i < n; i++) {
            // Start from 'E' - i and go down to 'A'
            for (char ch = (char)('E' - i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
