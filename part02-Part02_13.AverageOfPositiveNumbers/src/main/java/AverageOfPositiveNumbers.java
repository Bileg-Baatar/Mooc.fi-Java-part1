
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;
        
        while (true) {
            
            int ans = Integer.valueOf(scanner.nextLine());

            if (ans == 0) {
                if(count == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                break;
            } else {
                if(ans> 0){
                    sum+=ans;
                    count++;
                    continue;
                }
                
                
                
                

            }
        }
        avg = 1.0* sum/count;
        System.out.println(avg );

    }
}
