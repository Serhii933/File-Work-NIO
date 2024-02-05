import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public static String readFromFile(String fileName) {
        Path filePath = Paths.get(FileConfig.BASE_URL + fileName + ".txt");
        try {
            byte[] bytes = Files.readAllBytes(filePath);
            return new String(bytes);
        } catch (IOException e) {
            System.err.println("Помилка при читанні з файлу: " + e.getMessage());
            return null;
        }
    }
}

