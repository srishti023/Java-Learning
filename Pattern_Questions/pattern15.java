package Pattern_Questions;
// PATTERN : 

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *
    
public class pattern15 {
    public static void main(String[] args) {
        patternn15(5);
    }
    static void patternn15(int n)
    {
        for(int i=1 ; i<=5 ; i++)
        {
            for(int j=1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = n-i+1 ; j<=n+i-1 ; j++)
            {
                if(j==n-i+1 || j== n+i-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
