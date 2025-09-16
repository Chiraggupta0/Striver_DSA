// tc,sc -- o(n)
class Solution {
    int i=1;
    public void printNos(int n) {
        
       
        if(i==n+1) return;
         System.out.print(i+" ");
         i++;
         printNos(n);
    }
}
class recursion1to_n
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        obj.printNos(10);
    }
}