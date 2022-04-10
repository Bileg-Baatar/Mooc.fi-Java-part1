
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
public class Room {

    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        return this.personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {
        int shorty = Integer.MAX_VALUE;
        Person shortest = new Person("", 0);

        if (this.personList.isEmpty()) {
            return null;
        } else {
            for (Person i : this.personList) {
                if (i.getHeight() < shorty) {
                    shortest = i;
                    shorty = i.getHeight();
                }
            }
        }
        return shortest;

    }

    public Person take() {
        Person takeShort = this.shortest();

        if (this.personList.isEmpty()) {
            return null;
        }

        this.personList.remove(takeShort);

        return takeShort;
    }

    /*
    public void add(Person person) - add the person passed as a paramter to the list.
    public boolean isEmpty() - returns a boolean-type value true or false, that tells whether the room is empty or not.
    public ArrayList<Person> getPersons() - returns a list of the persons in the room.
     */
}
