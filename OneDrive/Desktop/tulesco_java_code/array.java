class hs{
    public int ns()
    {
        int arr[]={1,2,3,4};
        //if we want to just initialize an array it can be done by
        int arr1[]=new int[4];
        int i=0;
        while(i<4){
            System.out.println(arr[i]);
            i++;
        }
        
        
        return 0;
    }
}
public class array{
    public static void main( String args[]){
        hs obj=new hs();
        obj.ns();

    }
}