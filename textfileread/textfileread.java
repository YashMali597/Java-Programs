package textfileread;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textfileread{
    public static void main(String[] args) {
        try {

            String filePath = "yash.txt";

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while trying to read the file: " + e.getMessage());
        }
    }
}
