
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
public class UserInterface {

    private Scanner scan;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.scan = scan;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");

            String response = String.valueOf(this.scan.nextLine());
            if (response.equals("X")) {
                break;
            }
            if (response.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String jk = String.valueOf(this.scan.nextLine());
                this.jokes.addJoke(jk);

            }
            if (response.equals("2")) {
                System.out.println(this.jokes.drawJoke());

            }
            if (response.equals("3")) {
                System.out.println("Printing the jokes. ");
                this.jokes.printJokes();

            }

        }
    }
}
