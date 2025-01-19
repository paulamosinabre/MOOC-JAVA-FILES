import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        Cube cube = new Cube(num);
        System.out.println(cube.volume());
        System.out.println(cube);
    }
}
