package arraylistdescending;
import java.util.*;

public class arraylistdescending{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted List (descending): " + numbers);
    }
}
