// tc,sc--o(n)
class solution
{
    int fact(int n)
    {
        if(n==0 || n==1 ) return 1;
        return n*fact(n-1);
    } 
}
class factorial
{
    public static void main(String args[])
    {
        solution obj = new solution();
        System.out.println(obj.fact(4));
    }
}