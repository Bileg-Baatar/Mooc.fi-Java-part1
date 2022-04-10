
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

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

    private ArrayList<ArrayList<String>> storage;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.storage = new ArrayList<ArrayList<String>>();
    }

    public void start() {
        System.out.println("File to read: ");
        String fileName = String.valueOf(this.scan.nextLine());
        try ( Scanner scanOne = new Scanner(Paths.get(fileName))) {
            ArrayList<String> temp = new ArrayList<>();
            while (scanOne.hasNextLine()) {
                String content = scanOne.nextLine();

                if (!content.equals("")) {
                    temp.add(content);

                } else {
                    this.storage.add(temp);

                    temp = new ArrayList<>();

                }

            }
            if (!temp.isEmpty()) {
                this.storage.add(temp);
            }

            //System.out.println(this.storage);
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");

            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            while (true) {
                System.out.println("");
                System.out.println("Enter command: ");

                String command = String.valueOf(this.scan.nextLine());
                if (command.equals("stop")) {
                    break;
                }
                if (command.equals("list")) {
                    System.out.println("Recipes: ");
                    for (ArrayList<String> i : storage) {
                        System.out.println(i.get(0) + ", cooking time: " + i.get(1));
                    }
                }
                if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String word = String.valueOf(this.scan.nextLine());
                    System.out.println("Recipes:");
                    for (ArrayList<String> i : storage) {
                        if (i.get(0).contains(word)) {
                            System.out.println(i.get(0) + ", cooking time: " + i.get(1));
                        }
                    }
                }
                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    int time = Integer.valueOf(this.scan.nextLine());
                    System.out.println("Recipes:");
                    for (ArrayList<String> i : storage) {
                        if (Integer.valueOf(i.get(1)) <= time) {
                            
                            System.out.println(i.get(0) + ", cooking time: " + i.get(1));
                        }
                    }
                }
                if (command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    String word = String.valueOf(this.scan.nextLine());
                    System.out.println("Recipes:");
                    for (ArrayList<String> i : storage) {
                        if (i.contains(word)) {
                            
                            System.out.println(i.get(0) + ", cooking time: " + i.get(1));
                        }
                    }
                }

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
