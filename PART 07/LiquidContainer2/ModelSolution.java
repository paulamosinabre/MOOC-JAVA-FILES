 
public class Container {
 
    private int contains;
 
    public Container() {
        this.contains = 0;
    }
 
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
 
        this.contains = this.contains + amount;
        if (this.contains > 100) {
            this.contains = 100;
        }
    }
 
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
 
        this.contains = this.contains - amount;
        if (this.contains < 0) {
            this.contains = 0;
        }
    }
 
    public int contains() {
        return this.contains;
    }
 
    @Override
    public String toString() {
        return "" + this.contains + "/100";
    }
 
}
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
 
            if (input.equals("add")) {
                first.add(amount);
            }
 
            if (input.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
 
                first.remove(amount);
                second.add(amount);
            }
 
            if (input.equals("remove")) {
                second.remove(amount);
            }
 
            System.out.println("");
        }
    }
 
}
