//  tc,sc --o(N)
class Solution {
        int i=0;
    void printGfg(int N) {
        // code here
        if(i>=N) return;
        System.out.print("GFG ");
        i++;
        printGfg(N);
    }
}
class print_name_n_times_recursion
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        obj.printGfg(10);
    }
}