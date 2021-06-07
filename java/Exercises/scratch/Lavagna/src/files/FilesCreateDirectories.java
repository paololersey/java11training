package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCreateDirectories {
    public static void main(String[] args) throws IOException{
        var path = Paths.get("F:\\X\\Y\\Z");
        Files.createDirectories(path); // dir Y and Z created
    }
}
