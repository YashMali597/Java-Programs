package perfectsq;
import java.util.*;
import java.lang.Math;
public class perfectsquare{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i = 0; i<s;i++){
            if(i*i == s){
                System.out.println(i);
                break;
            }
            if((i*i!=s)&&(i>s/2)){
                System.out.println("Not a perfect square");
                break;
            }
        }

    }}
