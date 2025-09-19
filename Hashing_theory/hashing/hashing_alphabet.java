import java.util.Scanner;
class hashing_alphabet
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=new String();
        s=sc.next();
        int[] hash = new int[256];

        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
        }
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        System.out.println("\n--- Character Frequency Queries ---");
        while(q>0)
        {
            System.out.print("Enter character to check: ");
            char c=sc.next().charAt(0);
            System.out.println("Frequency of '" + c + "' = " + hash[c]);
            q--;
        }
        sc.close();
    }
}