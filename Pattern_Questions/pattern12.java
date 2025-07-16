package Pattern_Questions;
public class pattern12 {
    public static void main(String[] args) {
        patternn12(5);
    }
    static void patternn12(int n)
    {
        for(int i=1; i<=n ; i++)
        {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }
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
