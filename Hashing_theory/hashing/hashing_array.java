import java.util.Scanner;
class hashing_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int hash[]=new int[15];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }


        int q=sc.nextInt();
        System.out.println("enter the number which you want to test");
        while(q>0)
        {
            int number =sc.nextInt();
            System.out.println(hash[number]);
            q--;
        }
        
    }
} 
