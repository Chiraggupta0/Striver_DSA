class computer{
    public void music()
    {
        System.out.println("playing music");
    
    }
    public String getmeapen(int cost)
    {
        if(cost>=10)
        {
            return "pen";
        }
        else
        {
            return "nothing";
        }
    }
}

public class method3_18{
    public static void main(String args[]){
        computer obj = new computer();
        obj.music();
        String str=obj.getmeapen(5);
        System.out.println(str);
    }

}