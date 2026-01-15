// largest element
// tc-0(n)
// sc-0(1)
package array.Easy;

public class _1_2 {
    int largest(int arr[])
    {
        int n=arr.length;
        int large=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;

    }
    public static void main(String args[])
    {
        int arr[] = {2,33,21,2,33,21,65,544,2,44,134,333};
        _1_2 obj=new _1_2();
        int sol= obj.largest(arr);
        System.out.println(sol);
    }

}
