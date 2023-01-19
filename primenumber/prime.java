package primenumber;
import java.util.*;

public class prime{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 2;i<a;i++){
            if(a%i==0){
                System.out.println("Not Prime");
                break;
            }
            if((i > a-2)&& (a%i!=0)){
                System.out.println("Prime");

            }
        }
    }

}
