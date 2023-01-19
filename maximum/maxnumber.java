package maximum;
import java.util.*;
import java.lang.Math;
public class maxnumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num [] = new int[100];
        for(int i = 0;i<s;i++){

            num[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0;i<s;i++){
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("Max : "+max);

    }}
