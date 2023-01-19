package factorialnumber;
import java.util.*;
import java.lang.Math;
public class factorial{
    public static void fact(int num){
        int n = 1;
        for(int i = 1;i<=num;i++){
            n= n*i;
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }}
