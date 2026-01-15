package Strings.Easy;

public class _1_1 {
    public static void removeOuterParentheses(String s) {
       
        int open=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(open>0)
                {
                    System.out.print(s.charAt(i));
                }
                open++;
            }
            else{
                open--;
                if(open>0)
                {
                    System.out.print(s.charAt(i));
                }
            }
            
        }

    }
    public static void main(String args[])
    {
        String s="(()())(())(()(()))";
        removeOuterParentheses(s);
    }
}
