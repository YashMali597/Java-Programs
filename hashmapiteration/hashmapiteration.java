package hashmapiteration;
import java.util.*;
import java.util.stream.Collectors;

public class hashmapiteration{
    public static void main(String[] args) {
        HashMap<Integer,String> ab = new HashMap<>();
        ab.put(100,"Amit");
        ab.put(101,"Vijay");
        ab.put(102,"Rahul");

        for(Map.Entry m:ab.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Iterator<Integer> keyIterator = ab.keySet().iterator();
        while (keyIterator.hasNext()) {
            int key = keyIterator.next();
            System.out.println(key +" "+ ab.get(key));
        }

        for (Map.Entry<Integer, String> entry : ab.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> entryIterator = ab.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
