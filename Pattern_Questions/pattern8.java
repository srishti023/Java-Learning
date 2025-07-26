// PATTERN :
// \
//     *
//    ***
//   *****
//  *******
// *********

public class pattern8 {
    public static void main(String[] args) {
        patternn8(5);
    }
    static void patternn8(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n+i-1 ; j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
