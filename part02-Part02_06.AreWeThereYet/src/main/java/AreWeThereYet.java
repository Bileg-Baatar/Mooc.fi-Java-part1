
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int loop = Integer.valueOf(scanner.nextLine());

        while (loop != 4) {
            System.out.println("Give a number:");
            loop = Integer.valueOf(scanner.nextLine());

        }

    }
}
