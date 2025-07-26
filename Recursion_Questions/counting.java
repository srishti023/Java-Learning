public class counting {
    public static void main(String[] args) {
        counting(5);
    }
    static void counting(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        counting(n-1);
        System.out.println(n);
    }
}
