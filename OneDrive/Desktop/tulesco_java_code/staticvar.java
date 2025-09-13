// static variable are those which are shared by everyone
// they need to be called by their class name not with object
//  in short if we want to allot same value to all object then we use static
// the last value declared will be taken as final
class Mobile
{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand + " : " +price +" : "+ name );

    }
}
public class staticvar
{
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        Mobile.name="smartphone";

        Mobile.name="phone";




        obj1.show();
        obj2.show();

    }
}