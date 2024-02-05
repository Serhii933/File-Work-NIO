import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public static void writeToFile(String fileName, String content) {
        Path filePath = Paths.get(FileConfig.BASE_URL + fileName + ".txt");
        try {
            Files.write(filePath, content.getBytes());
            System.out.println("Файл успішно створено та записано.");
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
