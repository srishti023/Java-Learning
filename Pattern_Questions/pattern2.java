package Pattern_Questions;
//pattern:
// * 
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *
public class pattern2 {
    public static void main(String[] args) {
        patternn2(5);
    }
    static void patternn2(int n)
    {
        for(int row=0 ; row<n; row++)
        {
            for(int col=0; col<=row; col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
