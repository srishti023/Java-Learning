public class Sorted {
    public static void main(String[] args) {
        int []arr = {1,4,3,5,7,1,10};
        System.out.println(sortedOrNot(arr, 0));
    }
    static boolean sortedOrNot(int []arr,int n)
    {
        if(n==arr.length-1)
        {
            return true;
        }

        return arr[n]<arr[n+1] && sortedOrNot(arr, n+1);
    }
}
