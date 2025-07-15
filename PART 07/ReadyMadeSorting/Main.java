
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] num = {"3", "1", "5", "99", "3", "12"};
        sort(array);
        sort(num);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        sortIntegers(numbers);
        
        ArrayList<String> str = new ArrayList<>();
        str.add("8");
        str.add("3");
        str.add("7");
        sortStrings(str);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
       int index = 0;
       ArrayList<Integer> num = new ArrayList<>();
       for(String s: strings){
           num.add(Integer.parseInt(strings.get(index)));
           index++;
       }
       Collections.sort(num);
        System.out.println(num);
    }

}
