package Pattern_Questions;
// PATTERN :

//     *
//    * *
//   *   *
//  *     *
// *********

public class pattern13 {
    public static void main(String[] args) {
        patternn13(5);
    }
    static void patternn13(int n)
    {
        for(int i=1 ; i<=5 ; i++)
        {
            for(int j=1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = n-i+1 ; j<=n+i-1 ; j++)
            {
                if(j==n-i+1 || j== n+i-1 || i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
