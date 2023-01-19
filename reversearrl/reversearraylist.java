package reversearrl;
import java.util.*;

public class reversearraylist{

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n+1;i++){
            String a = sc.nextLine();
            al.add(a);
        }
//        for(int i=n;i>=0;i--){
//            System.out.print(al.get(i)+" ");
//        }
        ListIterator<String> list1=al.listIterator(al.size());
        while(list1.hasPrevious())
        {
            String str=list1.previous();
            System.out.print(str + " ");
        }
    }



}
