// Time Complexity: O(log n) (or O(d), number of digits)
// Space Complexity: O(1)
class reverse_a_no_2
{
    public static void main(String args[])
    {
        int x=5674;
        int reverse=0;
       while(x!=0)
       {
        int lastdigit=x%10;
        x=x/10;
        // check for overflow before multiplying by 10
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10)
            {
                    System.out.println(0);
                    break;
            }  // return 0 in case of overflow
        reverse=(reverse*10)+lastdigit;
       }
       System.out.println(reverse);
    }

}