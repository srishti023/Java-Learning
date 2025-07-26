public class addtillnth {
    public static void main(String[] args) {
        System.out.println(addtillend(5));
    }
    static int addtillend(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n+addtillend(n-1);
    }
}
