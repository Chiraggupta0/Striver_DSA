package array.Easy;

import java.util.Arrays;

public class _2_1 {
    void getElement(int arr[])
    {
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Second largest element= "+ arr[n-2]);
        System.out.println("Second Smallest element= "+ arr[1]);
    }
    public static void main(String args[])
    {
        int arr[] = {2,33,21,2,33,21,65,544,2,44,134,333};
        _2_1 obj = new _2_1();
        obj.getElement(arr);
    }

    
}
