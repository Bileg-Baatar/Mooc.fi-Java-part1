
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("");

        System.out.println("Search for? ");

        String name = String.valueOf(scanner.nextLine());
        boolean found = false;
        for (String i : list) {
            if (name.equals(i)) {
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println(name + " was found! ");
        }
        else{
            System.out.println(name + " was not found! ");
        }
    }
}
