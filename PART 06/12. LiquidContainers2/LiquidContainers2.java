
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            int first = 0;
            int second = 0;
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String parts[] = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            Container container = new Container();
            if(cmd.equals("add")){
                container.add(amount);
            } else if (cmd.equals("move")){
                
            } else if (cmd.equals("remove")){
                container.remove(amount);
            }

        }
    }

}
