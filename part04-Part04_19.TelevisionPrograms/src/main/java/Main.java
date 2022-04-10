import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String channelName = String.valueOf(scanner.nextLine());
            
            if(channelName.equals("")){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram prog = new TelevisionProgram(channelName, duration);
            
            programs.add(prog);
           
        
            
            
        }
        
        System.out.println("Program's maximum duration? ");
        int maxDur = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram i: programs){
            if(i.getDuration() <= maxDur){
                System.out.println(i.toString());
            }
        }
        

    }
}
