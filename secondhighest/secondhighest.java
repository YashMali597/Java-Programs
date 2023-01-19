package secondhighest;
import java.util.*;

public class secondhighest{
    public static void main(String[] args) {
        {
            int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            int highest = 0;
            int secondHighest = 0;
            for (int number : numbers) {
                if (number > highest) {
                    secondHighest = highest;
                    highest = number;
                } else if (number > secondHighest && number != highest) {
                    secondHighest = number;
                }
            }
            System.out.println("Second highest number is: " + secondHighest);
        }
    }
}
