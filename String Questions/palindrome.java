public class palindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdcba");
        
        System.out.println(isPalindrome(str));
        
    }
    static boolean isPalindrome(StringBuilder str)
    {
        if(str.equals(""))
        {
            return true;
        }
        int start =0;
        int end = str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
