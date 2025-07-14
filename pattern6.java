// PATTERN : 

//     *
//    **
//   ***
//  ****
// *****

public class pattern6 {
    public static void main(String[] args) {
        patternn6(5);
    }
    static void patternn6(int n)
    {
        for(int i=1; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
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
