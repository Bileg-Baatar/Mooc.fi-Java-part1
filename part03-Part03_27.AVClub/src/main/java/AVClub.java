
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            
            String sent = String.valueOf(scanner.nextLine());
            
            if(sent.equals("")){
                break;
            }
            
            String[] array = sent.split(" ");
            
            for(String i: array){
                if(i.contains("av")){
                    System.out.println(i);
                }
            }
        }
    }
}
