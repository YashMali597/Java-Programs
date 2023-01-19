package countcharacter;
import java.util.*;
public class countchar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        aa:
        for(int i = 0;i<s.length();i++){
            int count = 0;
            bb:
            for(int j=0;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j)){
                    if((j<i)){
                        continue aa;
                    }
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" : "+ count);
        }
    }}
