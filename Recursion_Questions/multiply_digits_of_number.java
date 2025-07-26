public class multiply_digits_of_number {
    public static void main(String[] args) {
        System.out.println(mulOfDigits(1234));
    }
    static int mulOfDigits(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return n%10 * mulOfDigits(n/10);
    }
}
