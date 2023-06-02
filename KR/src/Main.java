import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String path = new Scanner(System.in).nextLine();
        String path = "D:\\sss";
        File file = new File(path);

        Tree(file, 0);
    }

    static void Tree(File file, int level) {
        List<File> files = List.of(file.listFiles());
        if (file.isFile()) {
            System.out.println("-".repeat(level) + file.getName());
        }
        else if (file.isDirectory()) {
            for (File nestedFile : files){
                Tree(nestedFile, level + 1);
            }
        }
    }
}