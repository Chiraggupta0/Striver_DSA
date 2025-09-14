// this program is used to count the no of digits in a number using log 
//  tc=o(1)
//  sc=o(1)
class countdigits
{
    public static void main(String args[])
    {
        int n=2446;
        int cnt=(int)(Math.log10(n)+1);
        System.out.println(cnt);
    }
}

