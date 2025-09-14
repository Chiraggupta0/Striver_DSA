// tc-o(root n)
// sc-o(1)
import java.util.*;
class primeno_7
{
    public static void main(String args[])
    {
        int n=12;
        int count=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                count++;
            }
            
        }
        if(count>2)
            {
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
    }
}