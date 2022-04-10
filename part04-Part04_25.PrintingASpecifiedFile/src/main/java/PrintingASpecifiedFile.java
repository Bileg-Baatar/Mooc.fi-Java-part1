
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed? ");
        String pathName = String.valueOf(scan.nextLine());
        
        try(Scanner scanFiles = new Scanner(Paths.get(pathName))){
            
            while(scanFiles.hasNextLine()){
                
                String contents = scanFiles.nextLine();
                
                System.out.println(contents);
            }
            
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        
    }

    }
}
