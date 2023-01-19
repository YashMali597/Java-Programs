package hashsettolist;
import java.util.*;
import java.util.stream.Collectors;

public class hashsettolist{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        List<String> list = new ArrayList<>(hashSet);

        System.out.println( hashSet);
        System.out.println(list);
    }
}
