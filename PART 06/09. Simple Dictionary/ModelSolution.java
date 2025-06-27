import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
    }
}


import java.util.HashMap;
 
public class SimpleDictionary {
 
    private HashMap<String, String> translations;
 
    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }
 
    public String translate(String word) {
        return this.translations.get(word);
    }
 
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}

import java.util.Scanner;
 
public class TextUI {
 
    private Scanner scanner;
    private SimpleDictionary dictionary;
 
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
 
    public void start() {
 
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
 
            processCommand(input);
            System.out.println("");
        }
 
        System.out.println("Bye bye!");
    }
 
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
 
    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
 
    public void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
 
        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
}
