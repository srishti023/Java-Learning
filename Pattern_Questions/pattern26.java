// PATTERN :

// 111111
// 22222
// 3333
// 444
// 55
// 6

public class pattern26 {
    public static void main(String[] args) {
        patternn26(6);
    }
    static void patternn26(int n)
    {
        for(int i=1; i<=n ; i++)
        {
             // Inner loop to print the current number 'i' (n - i + 1) times
            for(int j=n ; j>=i ; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
