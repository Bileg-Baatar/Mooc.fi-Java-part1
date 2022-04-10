
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int ans = Integer.valueOf(scanner.nextLine());

            if (ans == 0) {

                break;
            } else {
                count+=ans;
                continue;

            }
        }
        System.out.println("Sum of the numbers: " + count);

    }
}
