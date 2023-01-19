package hashmapsort;
import java.util.*;
import java.util.stream.Collectors;

public class hashmapsort{
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("c", 3);
        unsortedMap.put("a", 1);
        unsortedMap.put("d", 4);
        unsortedMap.put("b", 2);
        System.out.println("Original Map: " + unsortedMap);

        // Sort by keys
        Map<String, Integer> sortedByKeys = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted by Keys: " + sortedByKeys);}
}
