package hashmap;
import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");
        System.out.println("Original Map: " + map);

        String key = "Key2";
        map.remove(key);
        System.out.println("Map after removing key " + key + ": " + map);
    }
}
