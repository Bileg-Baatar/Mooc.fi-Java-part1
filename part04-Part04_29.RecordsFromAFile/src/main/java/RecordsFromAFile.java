
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");

        String file = String.valueOf(scanner.nextLine());

        try ( Scanner f = new Scanner(Paths.get(file))) {

            while (f.hasNextLine()) {

                String lines = f.nextLine();
                String[] list = lines.split(",");
                String years = "";
                if (Integer.valueOf(list[1]) != 1) {
                    years = list[1] + " years";
                } else {
                    years = list[1] + " year";
                }
                System.out.println(list[0] + ", age:" + years);

            }

        } catch (Exception e) {

        }
    }
}
