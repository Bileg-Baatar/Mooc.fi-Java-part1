
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
public class Package {

    private ArrayList<Gift> giftPackages;

    public Package() {
        this.giftPackages = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.giftPackages.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (Gift i : this.giftPackages) {
            total += i.getWeight();
        }
        return total;
    }
}
