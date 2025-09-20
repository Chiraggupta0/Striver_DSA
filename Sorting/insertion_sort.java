class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=0;i<arr.length ;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
class insertion_sort
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        int[] arr={2,4,6,3,1,4,2,56,66,54,75,86,34};
        obj.insertionSort(arr);
        for(int x:arr)
        {
            System.out.println(x+" ");
        }
    }
}