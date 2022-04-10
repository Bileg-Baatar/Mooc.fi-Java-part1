
import java.util.Scanner;

public class Login {

    /*
    Enter username: alex
    Enter password: sunshine
    You have successfully logged in!
    
    
    alex	sunshine
    emma	haskell
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String user = String.valueOf(scanner.nextLine());

        System.out.println("Enter password: ");
        String pass = String.valueOf(scanner.nextLine());

        if (user.equals("alex") && pass.equals("sunshine")) {
            System.out.println("You have successfully logged in! ");
        } else if (user.equals("emma") && pass.equals("haskell")) {
            System.out.println("You have successfully logged in! ");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
