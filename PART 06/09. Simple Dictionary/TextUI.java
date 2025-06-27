
import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scan.nextLine();

                System.out.println("Translation: ");
                String translate = scan.nextLine();
                dictionary.add(word, translate);
            } else if (command.equals("search")){
                System.out.println("To be translated: ");
                String search = scan.nextLine();
                
                if(dictionary.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(search));
                }
                
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
