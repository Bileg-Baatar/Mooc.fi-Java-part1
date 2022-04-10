
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> myList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = String.valueOf(scanner.nextLine());

            if (id.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());

            if (name.equals("")) {
                break;
            }

            Archive idName = new Archive(id, name);
            if (myList.isEmpty()) {
                myList.add(idName);
            } else if (idName.isIn(idName, myList) == false) {
                myList.add(idName);
            }

        }

        System.out.println("==Items==");
        for(Archive i: myList){
            System.out.println(i.toString());
        }

    }
}
