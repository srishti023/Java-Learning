// PATTERN : 

// *
// * *
// * * *
// * * * * 
// * * * * *
// * * * *
// * * *
// * *
// *
public class pattern5 {
    public static void main(String []args)
    {
        patternn5(11);
    }
    static void patternn5(int n)
    {
        for(int row=0 ; row<n; row++)
        {
            if(row<=n/2)
            {
                for(int col=0 ; col<=row ; col++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            else{
                for(int col=0 ; col<=n-1-row ; col++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
