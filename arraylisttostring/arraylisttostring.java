package arraylisttostring;
import java.util.*;

public class arraylisttostring{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        String[] arr = list.toArray(new String[0]);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
