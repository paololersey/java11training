package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

public class FilesMoveAndDelete {
    
    public static void main(String[] args) throws IOException{

        Path source = Paths.get("/home/paolo/repositories/java/Exercises/scratch/Lavagna/src/files/source/a.txt"); 
        Path destination = Paths.get("/home/paolo/repositories/java/Exercises/scratch/Lavagna/src/files/dest"); 
        
        Files.move(source, destination); // line 1  -> Exception in thread "main" java.nio.file.FileAlreadyExistsException: /home/paolo/repositories/java/Exercises/scratch/Lavagna/src/files/dest
        Files.delete (source); // line 2   

        BasicFileAttributes attributes = Files.readAttributes(source, BasicFileAttributes.class);
    }
}
