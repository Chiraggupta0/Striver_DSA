class Solution
{
    public int f(int num, int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                count++;
            }
        }
    return count;
    }
}
class explain_hash{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        int[] arr={2,3,4,2,1,3,5,3};
        System.out.println(obj.f(5,arr));
    }
}