// tc=o(root n logn)
// sc=o(root n)
import java.util.*;
class printdivisors_6updated
{
    public static void main(String args[])
    {
        int n=36;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                numbers.add(i);
                if(n/i!=i)
                {
                    numbers.add(n/i);
                }
                
            }
        }
         Collections.sort(numbers);

        System.out.println("Divisors of " + n + " are: " + numbers);
    }
}