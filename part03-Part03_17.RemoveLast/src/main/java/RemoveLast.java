
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.get(strings.size() - 1));
        }
    }

}
