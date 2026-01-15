package array.Easy;

public class _3_2 {
    public static boolean sortedAndRotated(int arr[])
    {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[(i+1)%n]) count++;
        }
        return count<=1;
    }
    public static void main(String args[])
    {
        int arr[]={4,3,5,1,2};
        boolean sol=sortedAndRotated(arr);
        System.out.println(sol);
    }
}
