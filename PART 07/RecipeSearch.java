
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program");

        ArrayList<String> list = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = new String[100];
                
                String name = parts[0];
                int time = Integer.valueOf(parts[1]);
                if(line.isEmpty()){
                    
                }
                
            }

        } catch (Exception e) {

        }

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (String ingredients : list) {
                    System.out.println(ingredients);
                }
            }
        }
    }

}
