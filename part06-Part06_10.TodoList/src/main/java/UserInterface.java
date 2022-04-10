
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

    private TodoList list;
    private Scanner ui;

    public UserInterface(TodoList list, Scanner ui) {
        this.list = list;
        this.ui = ui;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = String.valueOf(this.ui.nextLine());
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String add = String.valueOf(this.ui.nextLine());
                this.list.add(add);
            }
            if (command.equals("list")) {
                this.list.print();

            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int remove = Integer.valueOf(this.ui.nextLine());
                this.list.remove(remove);
            }
        }
    }
}
