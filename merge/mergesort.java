package merge;
import java.util.Scanner;

public class mergesort{
    public static void conquer(int arr[],int start,int mid,int end){
        int merged[] = new int[end-start+1];
        int n1 = start;
        int n2 = mid + 1;
        int x = 0;

        while(n1<=mid && n2<=end){
            if(arr[n1]<=arr[n2]){
                merged[x] = arr[n1];
                x++; // or you can do merged[x++] = arr[n1++]
                n1++;
            }
            else{
                merged[x++] = arr[n2++];
            }
        }

        while(n1<=mid){
            merged[x++] = arr[n1++];

        }
        while(n2<=end){
            merged[x++] = arr[n2++];
        }

        for(int i=0,j=start;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[], int start,int end ){

        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);




    }
    public static void main(String[] args) {
        int arr[] = {9,3,5,1,6,4};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }



    }
}
