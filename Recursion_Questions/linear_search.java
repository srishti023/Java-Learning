import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int []arr = {1,7,4,2,7,6,7,7};
        ArrayList <Integer> arl = new ArrayList<>();
        System.out.println(linear_search(arr, 7, 0, arl));
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
    static ArrayList linear_search(int []arr, int n, int index, ArrayList <Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==n)
        {
            list.add(index);
        }
        return linear_search(arr, n, index+1, list);
    }
}
