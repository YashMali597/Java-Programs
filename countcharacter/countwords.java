package countnumber;
import java.util.*;

public class countwords {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count  = 0;

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) ==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
