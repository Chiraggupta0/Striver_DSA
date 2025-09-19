import java.util.HashMap; 
import java.util.Set;
import java.util.Map;
import java.util.Scanner;
class hash_map
{
    public static void main(String args[])
    {    Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
           
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print("Enter number of queries: ");

        int q= sc.nextInt();
        while(q>0)
        {
            System.out.print("Enter number to check: ");
            int number=sc.nextInt();
            System.out.println("Frequency of " + number + " = " + map.getOrDefault(number, 0));
            q--;
        }
        sc.close();
    }
}