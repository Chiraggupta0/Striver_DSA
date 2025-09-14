class Main
{
    public int gcd(int a , int b)
    {
        while(a>0 && b>0)
        {
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
}
class gcd_6
{
    public static void main(String args[])
    {
        Main obj = new Main();
        int res=obj.gcd(52,10);
        System.out.println(res);
    }
}