
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Title: ");

            String title = String.valueOf(scanner.nextLine());

            if (title.equals("")) {
                break;
            }
            System.out.println("Pages: ");

            String pages = String.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");

            String year = String.valueOf(scanner.nextLine());

            Book newBooks = new Book(title, pages, year);

            bookList.add(newBooks);

        }

        System.out.println("What information will be printed? ");
        String inputInfo = String.valueOf(scanner.nextLine());

        if (inputInfo.equals("everything")) {
            for (Book i : bookList) {
                System.out.println(i.toString());

            }
        } else {
            for (Book i : bookList) {
                System.out.println(i.getTitle());
            }
        }

    }
}
