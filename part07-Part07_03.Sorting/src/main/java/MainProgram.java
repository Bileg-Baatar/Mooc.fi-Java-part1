
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];

        for (int i : array) {

            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i : array) {

            if (i < smallest) {
                smallest = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }

        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
            }
        }

        for (int i = startIndex; i < table.length; i++) {
            if (smallest == table[i]) {
                index = i;
            }

        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int hold = array[index1];

        array[index1] = array[index2];

        array[index2] = hold;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
