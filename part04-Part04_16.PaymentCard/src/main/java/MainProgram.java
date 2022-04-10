
public class MainProgram {
    /*
    
    Paul tops up 20 euros
    Matt eats heartily
    The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
    Paul eats affordably
    Paul eats affordably
    Matt tops up 50 euros
    The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
    */

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);
        
        System.out.println("Paul: "+paulsCard.toString());
        System.out.println("Matt: "+mattsCard.toString());

    }
}
