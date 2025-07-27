public class linear_search {
    public static void main(String[] args) {
        int []arr = {1,4,2,6,7};
        System.out.println(linearSearch(arr, 7, 0));
    }
    static int linearSearch(int []arr, int n, int index)
    {
        if(index==arr.length)
        {
            return -1;
        }

        if(arr[index]==n)
        {
            return index;
        }
        return linearSearch(arr, n, index+1);
    }
}
