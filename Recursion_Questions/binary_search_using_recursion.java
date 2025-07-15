package Recursion_Questions;
public class binary_search_using_recursion {
    public static void main(String[] args) {
        int []arr = {1,2,4,6,8,10,12,14,15,17,20};
        System.out.println(bs_rec(arr, 0, arr.length-1, 0));
    }
    static int bs_rec(int []arr,int start, int end,int target)
    {
        if (start > end) {
            return -1;  
        }
        int mid = start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return bs_rec(arr, start, mid-1,target);
        }
            return bs_rec(arr, mid+1, end,target);
        
    }
}
