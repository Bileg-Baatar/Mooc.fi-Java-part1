
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
public class Hold {

    private int max;
    private ArrayList<Suitcase> suitcaseList;
    private int currentWeight;

    public Hold(int max) {
        this.max = max;
        this.suitcaseList = new ArrayList<>();
        currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() <= this.max) {
            suitcaseList.add(suitcase);
            currentWeight += suitcase.totalWeight();

        }
    }

    public void printItems() {
        for (Suitcase i : suitcaseList) {
            i.printItems();
        }

    }

    @Override
    public String toString() {
        return this.suitcaseList.size() + " suitcases" + " (" + currentWeight + " kg)";
    }
}
