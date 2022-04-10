
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bileg
 */
public class TextUI {

    private Scanner user;
    private SimpleDictionary dictionary;

    public TextUI(Scanner user, SimpleDictionary dictionary) {
        this.user = user;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = String.valueOf(this.user.nextLine());
            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = String.valueOf(this.user.nextLine());
                System.out.println("Translation: ");
                String translation = String.valueOf(this.user.nextLine());
                this.dictionary.add(word, translation);
            }
            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String search = String.valueOf(this.user.nextLine());
                if (this.dictionary.translate(search) == null) {
                    System.out.println("Word "+search+" was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(search));
                }
            }
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            }
            System.out.println("Unknown command");
        }
    }

}
