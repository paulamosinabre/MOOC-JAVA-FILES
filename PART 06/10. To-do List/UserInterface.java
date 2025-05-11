
import java.util.Scanner;

public class UserInterface {

    private TodoList toDo;
    private Scanner scan;

    public UserInterface(TodoList toDo, Scanner scan) {
        this.toDo = toDo;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String cmd = scan.nextLine();
            if (cmd.equalsIgnoreCase("stop")) {
                break;
            } else if (cmd.equalsIgnoreCase("add")) {
                System.out.println("To add: ");
                String toAdd = scan.nextLine();
                toDo.add(toAdd);
            } else if(cmd.equalsIgnoreCase("list")){
                toDo.print();
            } else if(cmd.equalsIgnoreCase("remove")){
                System.out.println("Remove: ");
                int remove = scan.nextInt();
                toDo.remove(remove);
                
            }

        }
    }

}
