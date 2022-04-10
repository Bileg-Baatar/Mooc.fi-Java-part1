
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String sentence = String.valueOf(scanner.nextLine());
            if (sentence.equals("")) {
                break;
            }
            String[] array = sentence.split(" ");

            if (array.length == 0) {
                System.out.println(sentence);
            } else {
                int i = 0;
                while (i < array.length) {
                    System.out.println(array[i]);
                    i++;
                }

            }

        }
    }
}
