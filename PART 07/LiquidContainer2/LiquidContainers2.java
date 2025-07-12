
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.parseInt(parts[1]);

            
            if (cmd.equals("add")) {
                container.add(amount);
                first = container.contains();

                if (first >= 100) {
                    first = 100;
                }
            } else if (cmd.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }

                first -= amount;
                second += amount;

                if (second > 100) {
                    second = 100;
                }

            } else if (cmd.equals("remove")) {
                container.remove(amount);
                second = container.contains();
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}
