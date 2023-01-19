package removespace;
import java.util.*;

public class removespaces1{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                System.out.print(a.charAt(i));
            }
        }
    }}
