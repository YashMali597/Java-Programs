package swapcasechar;
import java.util.Scanner;

public class swapcase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String convertedStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                convertedStr += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                convertedStr += Character.toLowerCase(ch);
            } else {
                convertedStr += ch;
            }
        }

        System.out.println("Converted string: " + convertedStr);
    }
}
