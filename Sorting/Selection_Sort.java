// tc- o(n^2) best average and worst all
class Solution
{
    public void Main(int[] arr , int n)
    {    
        for(int i=0 ;i<=n-2;i++)
        {
            int mini=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        
    }
}
class Selection_Sort
{
    public static void main(String args[])
    {
        int[] arr ={23,34,32,1,56};
        int n=5;
        Solution obj=new Solution();
        obj.Main(arr,n);
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}