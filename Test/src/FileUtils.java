import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


public class FileUtils {
    public static void main(String[] args) {
        System.out.println(calculateFolderSize("C:\\Progam Files"));
    }

    public static long calculateFolderSize(String path) {
        long sm = 0;
        try{
            Path
            File file = new File(path);
            for (File i : file.listFiles()) {
                sm += i.length();
            }
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
        return sm;
    }
}