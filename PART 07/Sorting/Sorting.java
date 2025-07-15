
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int numbers[], int startIndex) {
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }

    public static void swap(int[] array, int index1, int index2) {
        
        int arr = array[index1];
        array[index1] = array[index2];
        array[index2] = arr;
    }

    public static void sort(int[] array) {
         for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }

    }
}
