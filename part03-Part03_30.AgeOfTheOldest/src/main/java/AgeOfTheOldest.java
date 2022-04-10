
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eldest = -1;
        while (true) {

            String sent = String.valueOf(scanner.nextLine());

            if (sent.equals("")) {
                break;
            }

            String[] array = sent.split(",");
            int age = Integer.valueOf(array[1]);
            
            if(age > eldest){
                eldest = age;
            }
            
            
        }
        System.out.println("Age of the oldest: "+eldest);
    }
}
