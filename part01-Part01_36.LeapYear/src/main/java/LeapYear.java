
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Give a year:");
        Scanner scan = new Scanner(System.in);

        int year = Integer.valueOf(scan.nextLine());

        if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("The year is a leap year.");

        } else if (year % 400 == 0 && year % 100 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
