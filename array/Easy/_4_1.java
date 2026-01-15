package array.Easy;

import java.util.HashSet;

public class _4_1 {
    public static int removeDuplicates(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int n:arr)
        {
            set.add(n);
        }
        for(int nums:set)
        {
            System.out.println(nums);
        }
        System.out.print("total unique elements= ");
        return set.size();

    }
    public static void main(String args[])
    {
        int arr[]={1,1,1,2,2,3,3,4,5,6,6,6};
        int sol=removeDuplicates(arr);
        System.out.println(sol);
    }
}
