public class enhancedforloop
{
    public static void main(String args[])
    {
        int nums[] = new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=45;
        nums[3]=55;
//  this is an enhanced for loop in which we are giving value of nums into n and printing it
// best part about enhanced for loop is that we dont have to specify about the length anywhere

        for(int n:nums)
        {
            System.out.println(n);
        }
    }
}