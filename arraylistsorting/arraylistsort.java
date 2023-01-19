package arraylistsorting;
import java.util.*;

public class arraylistsort{

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n+1;i++){
            String a = sc.nextLine();
            al.add(a);
        }
        Collections.sort(al);
        for(int i=0;i<n+1;i++){
            System.out.print(al.get(i)+" ");
        }

    }

}
