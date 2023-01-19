package linkedlisttoarraylist;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class lltoal{
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");


        ArrayList<String> arrayList = new ArrayList<>(linkedList);


        System.out.println("ArrayList: " + arrayList);
    }
}
