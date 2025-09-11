class cal{
    public int as()
    {
        int nums[][]=new int[3][4];
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<4;k++)
                {
                    nums[j][k]=(int)(Math.random() *100);

                }
                System.out.println();
            }
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<4;k++)
                {

                    System.out.print(nums[j][k] + " ");
                }
                System.out.println();
            }
            for(int n[]:nums)
            {
                for(int m:n)
                {
                    System.out.print(m+" ");
                }
                System.out.println();
            }
        return 0;
    }
}
public class multidimensionarray
{
    public static void main(String args[])
    {
        cal obj = new cal();
        obj.as();

    }
} 