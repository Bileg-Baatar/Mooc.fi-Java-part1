
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String sent = String.valueOf(scanner.nextLine());

            if (sent.equals("")) {
                break;
            }

            String[] array = sent.split(" ");
            
            System.out.println(array[array.length-1]);
        }

    }
}
