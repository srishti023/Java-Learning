package Pattern_Questions;
// PATTERN :

// *********
//  *     *
//   *   *
//    * *
//     *
  
public class pattern14 {
    public static void main(String[] args) {
        patternn14(5);
    }
    static void patternn14(int n)
    {
        for(int i=1 ; i<=5 ; i++)
        {
            for(int j=1 ; j<=i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = i ; j<=(2*n)-i ; j++)
            {
                if(j==i || j== (2*n)-i || i==1)
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
