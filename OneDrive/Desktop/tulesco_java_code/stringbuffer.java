// string are immutable that it we can change them once declared so there are concepts like string buffer and string builder
// string buffer allows you to change your string and perform operations on it 
// both string buffer and string are two different things
public class stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("chirag");
        sb.append(" gupta");
        sb.insert(7,"java");
        sb.setLength(30);
        System.out.println(sb);
    }
}