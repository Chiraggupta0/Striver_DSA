// armstrong is when for eg 1634
// 1634 has 4 digits so 1^4+ 6^4 + 3^4 + 4^4 = to the same no 1634 then it is armstrong

// Time Complexity: O(log n) (looping through digits)
// Space Complexity: O(1)

class armstrongno_5
{
    public static void main(String args[])
    {
        int n=1634;
        int original=n;
        int ls=0;
        int digits=(int)(Math.log10(n)+1);
        while(n>0)
        {
            int lastdigit=n%10;
            ls = ls + (int)Math.pow(lastdigit, digits);
            n=n/10;
        }
        if(ls==original)
        {
            System.out.println(original + " is armstrong");
        }
        else
        {
            System.out.println(original + " is not armstrong");
        }
    }
}