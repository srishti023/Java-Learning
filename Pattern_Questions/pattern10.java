// PATTERN :

//     *
//    * *
//   * * *
//  * * * *
// * * * * *

public class pattern10 {
    public static void main(String[] args) {
        patternn10(5);
    }
    static void patternn10(int n)
    {
        for(int i=1 ; i<=n ; i++)
        {
            //for space
            for(int j=1 ; j<=n-i ; j++)
            {
                    System.out.print(" ");
            }
            for(int j=n-i+1 ; j<=n+i; j++)
            {
                if(i%2!=0)
                {
                    if(j%2!=0)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j%2==0)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
