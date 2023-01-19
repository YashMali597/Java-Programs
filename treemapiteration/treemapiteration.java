package treemapiteration;
import java.util.*;
import java.util.stream.Collectors;

public class treemapiteration{
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();


        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");


        Iterator<Integer> iterator = treeMap.keySet().iterator();


        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = treeMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
