
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money a = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return a;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        }

        return true;
    }

    public Money minus(Money decreaser) {
        Money b = new Money(0, 0);
        
        int cr = (this.euros - decreaser.euros);
        int ct = (this.cents - decreaser.cents);
        
        if(ct < 0){
            cr--;
            ct+=100;
        }
        
        
        
        if (ct > 99) {
            cr = cr + ct / 100;
            ct = ct % 100;
        }
        
        if (this.euros - decreaser.euros >= 0 ) {
            b = new Money(cr,ct );

        }

        return b;

    }
}
