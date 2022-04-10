
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = String.valueOf(scan.nextLine());
        
        try(Scanner f = new Scanner(Paths.get(file))){
            int count = 0;
            int lose = 0;
            int win = 0;
            ArrayList<String[]> teamArray = new ArrayList<>();
            while(f.hasNextLine()){
                
                String l = f.nextLine();
                String[] lines = l.split(",");
                teamArray.add(lines);
                
               
                
            }
            System.out.println("Team: ");
            String team = String.valueOf(scan.nextLine());
            
        
            for(String[] i: teamArray){
                if(team.equals(i[0])){
                    count++;
                    if(Integer.valueOf(i[2]) > Integer.valueOf(i[3])){
                        win++;
                    }else{
                        lose++;
                    }
                }
                if(team.equals(i[1])){
                    count++;
                    if(Integer.valueOf(i[2]) < Integer.valueOf(i[3])){
                        win++;
                    }
                    else{
                        lose++;
                    }
                }
                
            }
            System.out.println("Games: "+count);
            System.out.println("Wins: "+ win);
            System.out.println("Losses: "+lose);
            
            
        }catch(Exception e){
            
        }
    }

}
