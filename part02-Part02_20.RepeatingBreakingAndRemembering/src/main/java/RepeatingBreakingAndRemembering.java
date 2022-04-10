
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    /*
    Give numbers:
    5
    2
    4
    -1
    Thx! Bye!
    Sum: 11
    Numbers: 3
    Average: 3.666666666666
    Even: 2
    Odd: 1
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;

        int even = 0;
        int odd = 0;

        while (true) {
            int input1 = Integer.valueOf(scanner.nextLine());
            if (input1 != -1) {
                sum += input1;
                numbers++;
                if (input1 % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {

                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + (numbers));
                System.out.println("Average: " + 1.0 * sum / (numbers));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + (odd));
                break;
            }
        }

    }
}
