public class fibbonacci_numbers {
    public static void main(String[] args) {
        System.out.print(Fibbonacci(4));
    }
    static int Fibbonacci(int n)
    {
        if(n<2)
        {
            return n;
        }

        return Fibbonacci(n-1) + Fibbonacci(n-2);
    }
}
