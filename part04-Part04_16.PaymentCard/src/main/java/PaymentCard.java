/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bileg
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        // write code here
        this.balance -= 2.6;
        if (this.balance < 0) {
            this.balance += 2.6;
        }
    }

    public void eatHeartily() {
        // write code here
        this.balance -= 4.6;
        if (this.balance < 0) {
            this.balance += 4.6;
        }
    }

    public void addMoney(double amount) {
        // write code here
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
        if(amount < 0){
            this.balance -= amount;
        }
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }

}
