// PATTERN :

// *********
//  *******
//   *****
//    ***
//     *

public class pattern9 {
    public static void main(String[] args) {
        patternn9(5);
    }
    static void patternn9(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=2 * (n - i) + 1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
