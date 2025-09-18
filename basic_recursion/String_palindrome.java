class Solution
{
    public boolean ispalendrome(String s)
    {
        String sc=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0;
        int j=sc.length()-1;
        while(i<j)
        {
            if(sc.charAt(i)!=sc.charAt(j))
            {
                return false;
            }

        }
        return true;
    }
}
class String_palindrome
{
    public static void main(String args[])

    {
        String s=new String("ababa");
        Solution obj = new Solution();
        System.out.println(obj.ispalendrome(s));
    }
}