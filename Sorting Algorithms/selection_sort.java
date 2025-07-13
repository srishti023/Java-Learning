import java.util.*;
public class selection_sort{
    public static void main(String args[])
    {
        int arr[] = {3,7,1,9,8,5,6,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int []arr)
    {
        
        int n = arr.length;
        for (int i = n-1; i >0; i--) {
            int max = 0;
            for (int j = 1; j <=i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;           
        }
    }
}