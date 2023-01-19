package Armstrongnumber;
import java.util.*;
import java.lang.Math;
public class Armstrongnumber{
    public static void Armstrong(int num){
        int n = 0;
        int sum = 0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            n++;
        }
        temp = num;

        while(temp>0) {
            int a = temp% 10;
            sum +=(Math.pow(a,n));
            temp = temp / 10;
        }
        if(sum==num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Armstrong(a);
    }}
