package nonrepeatedcharacter;
import java.util.*;

public class nonrepeatedchar{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0;i<a.length();i++){
            int A = a.indexOf(a.charAt(i));
            int B = a.lastIndexOf(a.charAt(i));
            if(A==B){
                System.out.println(a.charAt(i));
                break;
            }



        }


    }
}
