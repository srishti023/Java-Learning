import java.util.ArrayList;

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
        linear_search(arr, n, index+1, list);
    }
}
