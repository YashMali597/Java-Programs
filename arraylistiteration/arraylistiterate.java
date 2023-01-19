package arraylistiteration;
import java.util.*;

public class arraylistiterate{

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n+1;i++){
            String a = sc.nextLine();
            al.add(a);
        }
        //For loop
//        for(int i=0;i<n+1;i++){
//            System.out.print(al.get(i)+" ");
//        }
        //While Loop
//        Iterator itr = al.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//
//        }
        //For-Each
//        al.forEach(i->{
//            System.out.print(i + " ");
//        });
        //For-each loop
//        for(String fruit:al)
//            System.out.println(fruit);
        //Iterator
//        Iterator <String> itr = al.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
        //Collection Stream
        al.stream().forEach(y->System.out.print(y+" "));

    }

}
