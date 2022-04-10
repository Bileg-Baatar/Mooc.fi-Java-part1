
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        GradeRegister reg = new GradeRegister();
        UserInterface a = new UserInterface(reg,scan);
        a.start();
    }
}
