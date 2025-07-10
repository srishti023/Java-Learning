import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {3,5,2,8,4,0,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {
            int start = i;
            boolean swapped = false;
            for(int j=1 ; j<arr.length-i ; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
