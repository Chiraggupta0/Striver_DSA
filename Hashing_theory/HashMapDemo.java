import java.util.HashMap; 
import java.util.Set;
import java.util.Map; 
class HashMapDemo
{
    public static void main(String args[])
    {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(11,"chirag");
        map.put(2,"Neha");
        map.put(3,"shubham");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsValue("chirag"));
        //  to iterate value
        //  make set and store map in it as set have unique value and so does the key of maps
        Set<Integer> keys = map.keySet();
        for(int i:keys)
        {
            System.out.println(map.get(i));
        }

        //  we can also do this
        for(int i:map.keySet())
        {
            System.out.println(map.get(i));
        }    
        Set<Map.Entry<Integer , String>> entries = map.entrySet();
        
        for(Map.Entry<Integer , String> entry :entries)
        {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
        for(Map.Entry<Integer , String> entry :entries)
        {
            entry.setValue(entry.getValue().toUpperCase());        
        }
        System.out.println(map);
    }
}