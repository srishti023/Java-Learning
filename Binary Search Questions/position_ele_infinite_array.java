public class position_ele_infinite_array {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7,8,9,11,12,14,15,17,19,23,25,27,29,30};
        int target = 29;
        System.out.println(ans(arr, target));
    }
    static int ans(int arr[], int target)
    {
        int start = 0;
        int end = 1;

        while(target>arr[end])
        {
            int newstart = end + 1;
            end = end + (end-start+1) * 2;
            start = newstart;
        }
        return binarySearch(arr,target, start, end);
    }
    public static int binarySearch(int arr[], int target,int start, int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
