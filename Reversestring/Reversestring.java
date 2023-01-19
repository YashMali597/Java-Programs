package Reversestring;

import java.util.*;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        for(int i = a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }

    }
}
