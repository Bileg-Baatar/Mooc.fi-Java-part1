
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("First name: ");
            String input = String.valueOf(scanner.nextLine());
            
            if(input.equals("")){
                break;
            }
            System.out.println("Last name: ");
            String lastName = String.valueOf(scanner.nextLine());
            
            System.out.println("Identification number: ");
            
            String idNumber = String.valueOf(scanner.nextLine());
            
            PersonalInformation info = new PersonalInformation(input, lastName, " ");
            
            infoCollection.add(info);
                
            
        
        }
        for(PersonalInformation i: infoCollection){
            System.out.println(i.getFirstName()+" "+i.getLastName());
        }
        

    }
}
