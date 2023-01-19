package duplicatecharacters;
import java.util.*;

public class duplicatecharacters{

        public static void main(String[] args) {
            String inputString = "AABCDEFG";
            char[] characters = inputString.toCharArray();

            Map<Character, Integer> charMap = new HashMap<Character, Integer>();
            // Iterate over the characters in the input string
            for (Character ch : characters) {
                if (charMap.containsKey(ch)) {
                    charMap.put(ch, charMap.get(ch) + 1);
                } else {
                    charMap.put(ch, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }

