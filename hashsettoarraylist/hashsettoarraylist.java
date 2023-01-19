package hashsettoarraylist;
import java.util.*;

public class hashsettoarraylist{
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        // Using the constructor
        List<Integer> list1 = new ArrayList<>(hashSet);

        // Using the addAll() method
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(hashSet);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }
}
