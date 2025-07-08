
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.println("");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (cmd.equals("add") && amount > 0) {

                first += amount;

                if (first >= 100) {
                    first = 100;
                }
            } else if (cmd.equals("move") && amount > 0) {
                
                if(amount > first){
                    amount = first;
                }
                
                first -= amount;
                second += amount;
                
                if (second > 100) {
                    second = 100;
                }
            } else if (cmd.equals("remove") && amount > 0) {
                second -= amount;

                if (second < 0) {
                    second = 0;
                }
            }
        }
    }

}
