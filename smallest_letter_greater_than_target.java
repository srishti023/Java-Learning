public class smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char []arr = {'c','f','j'};
        char target = 'l';

        System.out.println(smallest_letter_gtt(arr,target));

    }
    static char smallest_letter_gtt(char arr[], char target)
    {
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
