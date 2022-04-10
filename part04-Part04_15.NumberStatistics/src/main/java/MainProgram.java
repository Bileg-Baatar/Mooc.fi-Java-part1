
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers: ");

        Statistics calculate = new Statistics();
        Statistics calculateEven = new Statistics();
        Statistics calculateOdd = new Statistics();
        
        
        
        while (true) {

            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                
                break;
            }

            if (numbers % 2 == 0) {
                calculateEven.addNumber(numbers);
            } else {
                calculateOdd.addNumber(numbers);
            }
            calculate.addNumber(numbers);
            

        }
        
        System.out.println("Sum: " + calculate.sum());
        System.out.println("Sum of even numbers: " + calculateEven.sum());
        System.out.println("Sum of odd numbers: "+ calculateOdd.sum());
    }
}
