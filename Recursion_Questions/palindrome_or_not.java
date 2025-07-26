public class palindrome_or_not {

    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }

    static boolean isPalindrome(int a) {
        int reversed = reverse(a, 0);
        return a == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1321)); // false
        System.out.println(isPalindrome(1221)); // true
    }
}
