class Solution
{
    public void bubblesort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
class bubblesort2
{
    public static void main(String args[])
    {
        int[] arr={23,33,43,13,1,44,53,21};
        Solution obj =new Solution();
        obj.bubblesort(arr);
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
}