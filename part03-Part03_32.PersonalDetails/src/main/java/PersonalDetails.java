
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    /*
    sebastian,2017
    lucas,2017
    lily,2017
    hanna,2014
    gabriel,2009

Longest name: sebastian
Average of the birth years: 2014.8
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int size = 0;
        while (true) {

            String sent = String.valueOf(scanner.nextLine());

            if (sent.equals("")) {
                break;
            }
            String[] array = sent.split(",");
            
            sum += Integer.valueOf(array[1]);
            
            if(longestName.length()< array[0].length()){
                longestName = array[0];
            }
            size++;
            
        }
        System.out.println("Longets name: "+longestName);
        System.out.println("Average of the birth years: " +1.0* sum/size);
        
        
    }
}
