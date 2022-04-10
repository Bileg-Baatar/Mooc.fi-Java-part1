
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int ans = Integer.valueOf(scanner.nextLine());

            if (ans == 0) {

                break;
            } else if (ans < 0) {
                count++;
                continue;
            } else {

                continue;

            }
        }
        System.out.println("Number of negative numbers: " + count);

    }
}
