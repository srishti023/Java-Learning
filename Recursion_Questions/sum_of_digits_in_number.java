public class sum_of_digits_in_number {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123456789));
    }
    static int sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
