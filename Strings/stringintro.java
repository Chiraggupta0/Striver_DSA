package Strings;
import java.util.*;


public class stringintro {
    public static void main(String args[])
    {
        // // String declaration
        // String name="chirag";
        // System.out.println(name);
        // //  input string
        // Scanner sc = new Scanner(System.in);
        // String fullname= sc.nextLine();
        // System.out.println("full name is"+fullname);
        // //  concatination

        // String firstname="shourya";
        // String lastname="rastogi";
        // String newfullname=firstname+lastname;
        // System.out.println(newfullname);
        // // length
        // System.out.println(newfullname.length());
        // // charat
        // for(int i=0;i<newfullname.length();i++)
        // {
        //     System.out.println(newfullname.charAt(i));
        // }

        // comparing values
        // 1 s1>s2 : +ve value
        // 2 s1=s2:0
        //3 si<s2: -ve value  
        // String s1="hirag";
        // String s2="hgirag";
        // if(s1.compareTo(s2)==0)
        // {
        //     System.out.println("equal strings");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        // //  here if(s1==s2) will also work but we dont use it as in some cases it might fail so when doing cp some test cases might fail so we use compareTo instead

        // substring

        String sen="my name ois chirag";
        // substring(start index, last index(excluded))
        String sen2=sen.substring(3,8);
        System.out.println(sen2);


    }
}
