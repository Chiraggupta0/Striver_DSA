// Time Complexity: O(log n) (or O(d) where d is the digit count)
// Space Complexity: O(1)
class palindrome {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int original=x;
        while(x!=0)
        {
            int lastdigit=x%10;
            revnum=(revnum*10)+lastdigit;
            x=x/10;
        }
        if(original<0) return false;
        if(revnum==original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class palindrome_3
{
    public static void main(String args[])
    {
        palindrome obj = new palindrome();
        boolean res=obj.isPalindrome(121);
        System.out.println(res) ;
    }
}