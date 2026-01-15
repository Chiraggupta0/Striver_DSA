package array.Easy;

public class _3_1 {
    public static boolean sorted(int arr[])
    {
        // int count=0;
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,5};
        boolean sol= sorted(arr);
        System.out.println(sol);
    }
}
