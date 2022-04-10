
import java.util.ArrayList;
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
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.birdList = new ArrayList<>();
    }

    public void start() {

        while (true) {
            System.out.println("?");
            String command = String.valueOf(this.scan.nextLine());
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String bName = String.valueOf(this.scan.nextLine());
                System.out.println("Name in Latin: ");
                String lName = String.valueOf(this.scan.nextLine());

                Bird newBird = new Bird(bName, lName);

                if (!birdList.contains(newBird)) {
                    birdList.add(newBird);
                }

            }
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String obsName = String.valueOf(this.scan.nextLine());
                Boolean found = false;
                for (Bird i : birdList) {
                    if (i.getName().equals(obsName)) {
                        i.addObs();
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Not a bird!");
                }
            }
            if (command.equals("All")) {
                for (Bird i : birdList) {
                    System.out.println(i.toString());
                }
            }
            if (command.equals("One")) {
                System.out.println("Bird?");
                String birdName = String.valueOf(this.scan.nextLine());
                for (Bird i : birdList) {
                    if (birdName.equals(i.getName())) {
                        System.out.println(i.toString());
                    }
                }

            }
        }

    }

}
