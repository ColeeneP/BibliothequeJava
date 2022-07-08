import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;

public class ReadFile {
    public static void main(String[] args) throws MalformedURLException, IOException {
        File file = new File("C:/Users/Coleene/Documents/test.txt");

        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}