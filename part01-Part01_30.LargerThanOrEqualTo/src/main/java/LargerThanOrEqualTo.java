
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");

        int ans = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");

        int ans2 = Integer.valueOf(scan.nextLine());

        if (ans > ans2) {
            System.out.println("Greater number is: " + ans);
        } else if (ans < ans2) {
            System.out.println("Greater number is: " + ans2);
        } else {
            System.out.println("The numbers are Equal!");
        }

    }
}
