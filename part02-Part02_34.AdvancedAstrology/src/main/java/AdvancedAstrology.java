
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int num = 1;
        while (num <= number) {
            System.out.print("*");
            num++;

            // first part of the exercise
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int num = 1;
        while (num <= number) {
            System.out.print(" ");
            num++;

            // first part of the exercise
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int num = 1;
        int num2 = size;
        while (num <= size) {
            printSpaces(num2-1);
            printStars(num);
            num2--;
            num++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int num = 1;
        int num2 = height-1;
        while(height*2>= num){
            printSpaces(num2);
            printStars(num);
            
            num2--;
            num+=2;
            
        }
        int tree = 3;
        int ct = 2;
        while(tree >= ct ){
            printSpaces(height-2);
            printStars(tree);
            ct++;
        }
        
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
