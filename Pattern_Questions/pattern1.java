package Pattern_Questions;
// pattern : 
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
// *  *  *  *  *
public class pattern1 {
    public static void main(String[] args) {
        patternn1(5);
    }
    static void patternn1(int n)
    {
        for(int row=0; row<n; row++)
        {
            for(int col=0; col<n; col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
