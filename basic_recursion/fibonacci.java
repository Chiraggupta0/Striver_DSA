class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
class fibonacci
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        System.out.println(obj.fib(9));
    }
}