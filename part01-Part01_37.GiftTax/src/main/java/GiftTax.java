
import java.util.Scanner;

public class GiftTax {

    /*
    Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
    5 000 — 25 000	100	8
    25 000 — 55 000	1 700	10
    55 000 — 200 000	4 700	12
    200 000 — 1 000 000	22 100	15
    1 000 000 —	142 100	17
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int value = Integer.valueOf(scan.nextLine());
        int tax = 0;
        double rate = 0;
        int lowEnd = 0;

        if (value >= 5000 && value < 25000) {
            tax = 100;
            rate = 0.08;
            lowEnd = 5000;
        } else if (value >= 25000 && value < 55000) {
            tax = 1700;
            rate = 0.10;
            lowEnd = 25000;
        } else if (value >= 55000 && value < 200000) {
            tax = 4700;
            rate = 0.12;
            lowEnd = 55000;
        } else if (value >= 200000 && value < 1000000) {
            tax = 22100;
            rate = 0.15;
            lowEnd = 200000;
        } else if (value >= 1000000) {
            tax = 142100;
            rate = 0.17;
            lowEnd = 1000000;
        } else{
            System.out.println("No tax!");
        }

        double taxpay = (1.0 * tax + (value - lowEnd) * rate);

        System.out.println("Tax: " + taxpay);

    }
}
