package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MappDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("England", "London");
        map.put("Italy", "Paris");
        map.put("Australia", "Melbourne");
        System.out.println("Keys : " + map.keySet() + "\nvalue: " + map.values() + "\nEntries" + map.entrySet());
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e);
        }
    }
    
}
