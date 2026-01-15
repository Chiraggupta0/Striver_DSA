package array.Easy;

public class _4_2 {
    public static int removeDuplicate(int arr[])
    {
        int n=arr.length;
        int i=0;
       
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;    
                arr[i]=arr[j];
                
            }
        }
        return i+1;
    }
    public static void main(String args[])
    {
        int arr[]={1,1,1,2,3,4,4,4,4,5,5,6,6,6};
        System.out.println("no of unique elements = " + removeDuplicate(arr));
        System.out.println("unique elements");
        for(int nums:arr)
        {
            System.out.print(" "+ nums);
        }
    }
}
