package anagramstring;
import java.util.*;
import java.lang.Math;
public class anagram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        String s3 = s1.replace(" ","");
//        String s4 = s2.replace(" ","");
        int count = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        count++;

                    }
                }

            }
        }
        if (count != s1.length() || s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        }
        if (count == s1.length()) {
            System.out.println("Anagram");
        }

    }}
