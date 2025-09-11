//method overloading

class calculator
{
    public int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    public double add(double num1,int num2)
    {
        return num1+num2;
    }
}
public class methodoverloading{
    public static void main(String args[])
    {
        calculator obj=new calculator();
        System.out.println(obj.add(2,5));
        System.out.println(obj.add(2,5,8));
        System.out.println(obj.add(2.0,5));

    }
}