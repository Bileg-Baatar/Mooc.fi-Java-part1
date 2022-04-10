
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        while (true) {
            System.out.println("Give a number:");
            int ans = Integer.valueOf(scanner.nextLine());

            if (ans < 0) {
                System.out.println("Unsuitable number");
                continue;

            } else if (ans == 0) {
                break;
            } else {
                System.out.println(ans *= ans);
                continue;

            }
        }

    }
}
