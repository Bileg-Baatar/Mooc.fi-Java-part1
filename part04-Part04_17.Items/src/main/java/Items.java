
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Name: ");
            String input = String.valueOf(scanner.nextLine());
            
            if(input.equals("")){
                break;
            }
            Item newItems = new Item(input);

            items.add(newItems);

        }
        
        for(Item i:items){
            System.out.println(i.toString());
        }
    }
}
