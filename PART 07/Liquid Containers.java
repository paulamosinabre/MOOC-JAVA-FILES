
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
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (input.equals("quit")) {
                break;
            }

            if (cmd.equals("add")) {
                int total = first + amount;
               
                first = total;
                System.out.println(total);
                 
                if(total >= 100){
                    first = 100;
                }
            } else if (cmd.equals("move")){
                int totalSec = second + amount;
                second = totalSec;
                first -= amount;
                
                if(totalSec >= 100){
                    second = 100;
                }
            }
        }
    }
    
}
