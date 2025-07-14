// PATTERN :

// *****
//  ****
//   ***
//    **
//     *

public class pattern7 {
    public static void main(String[] args) {
        patternn7(5);
    }
    static void patternn7(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                if(j<=i-1)
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
