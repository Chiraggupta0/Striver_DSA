tc,sc --o(n)
class Solution {
    int i=1;

    void printNos(int N) {
        // code here
        if(i>N) return;
        System.out.print(N+" ");
        N--;
        printNos(N);
    }
}
class print_n_to_1
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        obj.printNos(10);
    }
}