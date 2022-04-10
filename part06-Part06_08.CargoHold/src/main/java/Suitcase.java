
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
public class Suitcase {

    private int max;
    private ArrayList<Item> itemList;
    private int remainWeight = 0;

    public Suitcase(int max) {
        this.itemList = new ArrayList<>();
        this.max = max;
    }

    public void addItem(Item item) {

        if (remainWeight + item.getWeight() <= this.max) {
            itemList.add(item);
            remainWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item i : itemList) {
            System.out.println(i.toString());
        }
    }

    public int totalWeight() {
        return this.remainWeight;
    }

    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }
        Item heaviest = itemList.get(0);

        for (Item i : itemList) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;

            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (this.itemList.size() == 0) {
            return "no items (" + this.remainWeight + " kg)";
        } else if (this.itemList.size() == 1) {
            return itemList.size() + " item (" + this.remainWeight + " kg)";
        }

        return itemList.size() + " items (" + this.remainWeight + " kg)";

    }

    //
}
