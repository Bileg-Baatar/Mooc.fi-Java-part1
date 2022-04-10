
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eldest = -1;
        String name = "";
        while (true) {

            String sent = String.valueOf(scanner.nextLine());

            if (sent.equals("")) {
                break;
            }

            String[] array = sent.split(",");
            int age = Integer.valueOf(array[1]);
            
            if(age > eldest){
                eldest = age;
                name = array[0];
            }
            
            
        }
        
        System.out.println("Name of the oldest: "+name);


    }
}
