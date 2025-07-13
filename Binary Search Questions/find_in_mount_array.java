public class find_in_mount_array {
    public static void main(String[] args) {
        int arr[] = {0,5,3,1};
        System.out.println(findInMountainArray(3,arr));
        
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peakele = peakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr,target, 0,peakele);
        if(firstTry!=-1)
        {
            return firstTry;
        }
           return orderAgnosticBS(mountainArr,target,peakele+1,mountainArr.length-1); 
    }
    static int peakElement(int arr[])
    {
        int start = 0;
        int end = arr.length-1 ; 
        while(start<end)
        {
            int mid = start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start];

    }
    public static int orderAgnosticBS(int arr[], int target,int start, int end)
    {
        boolean isASC = arr[start]<arr[end];
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isASC)
            {
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
