class function
{
    static void pyramid(int n)
    {
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++)
            {
                System.out.print("*");
            }
            for(int l=0;l<n-i-1;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void inverted_pyramid(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
        
            for(int j=0;j< 2*N -(2*i +1);j++){
                
                System.out.print("*");
            }
            
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
        
            System.out.println();
        }
    }
}
class pattern9
{
    public static void main(String args[])
    {
        function obj = new function();
        obj.pyramid(6);
        obj.inverted_pyramid(5);
    }
}