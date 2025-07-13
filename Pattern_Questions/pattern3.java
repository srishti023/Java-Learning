package Pattern_Questions;
// Pattern : 

// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *
public class pattern3 {
    public static void main(String[] args) {
        patternn3(5);
    }
    static void patternn3(int n)
    {
        for(int row=0; row<n ; row++)
        {
            for(int col=0 ; col<=n-1-row; col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
