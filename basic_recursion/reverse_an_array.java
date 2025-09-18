class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char temp =s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            
        }
        
    }
}
class reverse_an_array
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        char[] charArray = "chirag".toCharArray();
        obj.reverseString(charArray);
        String reversed=new String(charArray); 
        System.out.println(reversed);
    }
}