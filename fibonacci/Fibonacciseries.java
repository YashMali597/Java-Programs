package fibonacci;
import java.util.*;
import java.lang.Math;
public class Fibonacciseries{
    public static void Fibo(int num){
        int a = 0;
        int b = 1;
        int c=0;
        System.out.println(a);
        System.out.println(b);

        while(c<num) {
            c = a + b;
            if(c<num){
                System.out.println(c);
                a = b;
                b = c;}
            if(c>num){
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fibo(a);
    }}
