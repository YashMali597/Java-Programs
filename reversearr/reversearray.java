package reversearr;
import java.util.Scanner;

public class reversearray{

    public static void main(String[] args) {
        int arr[] = {3, 8, 5, 7, 4};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int temp = 0;


        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
        for(int a = 0;a<n;a++){
            System.out.print(arr[a] + " ");


        }




    }
}
