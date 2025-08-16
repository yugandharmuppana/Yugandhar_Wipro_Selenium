package Day10_assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class FilesWalk_demo {
	public static void main(String[] args) {
        
        Path startPath = Paths.get("C:\\Users\\ASUS\\Desktop\\Wipro\\Yugandhar");

     
        try (Stream<Path> pathStream = Files.walk(startPath)) {
            pathStream
                .filter(Files::isRegularFile) // Only include regular files
                .forEach(System.out::println); // Print file paths
        } catch (IOException e) {
            System.err.println("Error walking the file tree: " + e.getMessage());
        }
    }
}