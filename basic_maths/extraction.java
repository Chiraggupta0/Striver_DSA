// tc-o(d) where d in the no of digits in the number
//                      or
// tc-0(log n)
//  sc-o(1)


public class extraction
{
    public static void main(String args[])
    {
        int n=7789;
        
        
            do
            {
                int last_digit=n%10;
                System.out.println(last_digit);
                n=n/10;
            }while(n>0);
        
    }
}
