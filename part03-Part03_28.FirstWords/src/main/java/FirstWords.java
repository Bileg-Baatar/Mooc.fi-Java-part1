
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String sent = String.valueOf(scanner.nextLine());

            if (sent.equals("")) {
                break;
            }

            String[] array = sent.split(" ");
            
            System.out.println(array[0]);
        }
    }
}
