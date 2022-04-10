
import java.util.Scanner;

public class DifferentTypesOfInput {
    /*
    Give a string:
    bye-bye
    Give an integer:
    11
    Give a double:
    4.2
    Give a boolean:
    true
    You gave the string bye-bye
    You gave the integer 11
    You gave the double 4.2
    You gave the boolean true
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        
        String a = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int b = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double c = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean d = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string "+a);
        System.out.println("You gave the integer "+b);
        System.out.println("You gave the double "+c);
        System.out.println("You gave the boolean "+d);

    }
}
