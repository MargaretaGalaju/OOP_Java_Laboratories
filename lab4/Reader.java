package OOP.lab4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


    public class Reader {

        public static List<String> readFile(String file) {
            List<String> lines = null;
            try {
                lines = Files.readAllLines(Paths.get(String.format("%s.%s", file, "txt")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
        }
}
