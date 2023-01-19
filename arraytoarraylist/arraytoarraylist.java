package arraytoarraylist;
import java.util.*;

public class arraytoarraylist{
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i< arr.length;i++){
            list.add(arr[i]);
        }
        System.out.print(list);
//        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
//
//        System.out.println("ArrayList: " + arrayList);


    }
}
