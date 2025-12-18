import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class MarkdownReporter {

    public static void writeToFile(String filename, List<String> lines) throws IOException {
        Path outputPath = Paths.get("reports");
        if (Files.notExists(outputPath)) {
            Files.createDirectories(outputPath);
        }

        Path filePath = outputPath.resolve(filename);
        Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

}
