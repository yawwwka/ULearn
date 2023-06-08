import java.util.HashMap;
import java.util.Map;

public class FileUtils {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        if (map.get("name") == null) System.out.println(map.get("name"));
    }
}