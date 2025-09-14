public class jaggedand3darray
{
    public static void main(String args[])
    {
        int nums[][]= new int[3][];
        nums[0]=new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int n[]:nums)
        // this is an enhanced for loop in which we are giving value of nums in array n[]
        {
            for(int m:n)
        // here we are giving value of n in m
        // these are useful as we dont have to specify their length of array
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        
    }
    
}