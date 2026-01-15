package array.Easy;

public class _2_2 {
    public static void getElement(int arr[])
    {
        int n=arr.length;
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>large) large=arr[i];
            if(arr[i]<small) small=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<secSmall && arr[i]!=small)
            {
                secSmall=arr[i];
            }
            if(arr[i]>secLarge && arr[i]!=large)
            {
                secLarge=arr[i];
            }
        }
        System.out.println("second smallest= "+ secSmall);
        System.out.println("second Largest= "+ secLarge);
    }
    public static void main(String args[])
    {
        int arr[] = {2,33,21,2,33,21,65,544,2,44,134,333};
        getElement(arr);

    }
}
