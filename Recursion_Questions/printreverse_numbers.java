public class printreverse_numbers {
    public static void main(String[] args) {
        int n =5;
        reverse(n);
    }
    static int reverse(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return reverse(n-1);
    }
}

