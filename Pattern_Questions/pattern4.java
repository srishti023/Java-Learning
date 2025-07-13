package Pattern_Questions;
// PATTERN :

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
public class pattern4 {
    public static void main(String[] args) {
        patternn4(5);
    }
    static void patternn4(int n)
    {
        for(int row=1 ; row<=n ; row++)
        {
            for(int col=1 ; col<=row ; col++)
            {
                System.out.print(" "+ col);
            }
            System.out.println();
        }
    }
}
