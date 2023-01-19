package commonelement;
import java.util.*;

public class commonelements{



    public static void main(String[] args) {
        int arr1[] = {1,4,7,9,2};
        int arr2[] = {1,7,3,4,5};
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    al.add(arr1[i]);
                }
            }
        }
        System.out.println(al);
    }
}
