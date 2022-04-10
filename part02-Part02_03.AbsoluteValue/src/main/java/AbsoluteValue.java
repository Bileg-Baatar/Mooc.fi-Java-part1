
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ans = Integer.valueOf(scanner.nextLine());

        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(ans *= -1);
        }

    }
}
