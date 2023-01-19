package arraytotreeset;
import java.util.*;
import java.util.stream.Collectors;

public class arraytotreeset{
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(colors));

        System.out.println("TreeSet: " + treeSet);
    }
}
