
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Shall we carry on?");
        String loop = String.valueOf(scanner.nextLine());
        
        
        
        while(!loop.equals("no")){
            System.out.println("Shall we carry on?");
            loop = String.valueOf(scanner.nextLine());
            
        }

    }
}
