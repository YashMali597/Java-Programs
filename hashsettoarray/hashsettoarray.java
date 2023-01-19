package hashsettoarray;
import java.util.*;
import java.util.stream.Collectors;

public class hashsettoarray{
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println(hashSet);
        System.out.println(Arrays.toString(array));
    }
}
