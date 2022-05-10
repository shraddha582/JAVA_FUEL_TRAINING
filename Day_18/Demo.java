import java.util.*;
import java.util.Map.Entry;

public class Demo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map1 ;
        map1 =  new HashMap<>();

        map1.put(10,"A");
        map1.put(20,"B");
        map1.put(30,"B");

        System.out.println(map1);

        // to read all keys from map use set methods

        Set<Integer> keys = map1.keySet();
        System.out.println("Keys");

        for(Integer K:keys){
            System.out.println(K);
        }

        // to read values from map use values() methods

        Collection<String> values = map1.values();
        System.out.println("Values");

        for(String V:values){
            System.out.println(V);
        }

        // Reading all items from map
        System.out.println("Items");

        Set<Entry<Integer , String>> items = map1.entrySet();

        for(Entry<Integer , String> e : items){
            System.out.println(e.getKey() + ":" + e.getValue()); 
        }

    }

}
