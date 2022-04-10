
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fac = 1;
        int input1 = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input1; i++) {
            if (input1 == 0) {
                System.out.println(fac);
                break;

            } else {
                fac *= i;
            }
        }
        System.out.println(fac);
    }
}
