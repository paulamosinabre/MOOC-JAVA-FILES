 
public class Bird {
 
    private String name;
    private String nameInLatin;
    private int observations;
 
    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }
 
    public String name() {
        return this.name;
    }
 
    public void observation() {
        this.observations++;
    }
 
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + this.observations + " observations";
    }
}
import java.util.ArrayList;
 
public class BirdDatabase {
 
    private ArrayList<Bird> birds;
 
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
 
    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                bird.observation();
                return true;
            }
        }
 
        return false;
    }
 
    public void add(String name, String nameInLatin) {
        this.birds.add(new Bird(name, nameInLatin));
    }
 
    public String getOne(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }
 
        return null;
    }
 
    public String getAll() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }
 
        return allBirds;
    }
 
}
import java.util.Scanner;
 
public class UserInterface {
 
    private Scanner scan;
    private BirdDatabase birdbase;
 
    public UserInterface(Scanner scan, BirdDatabase birdbase) {
        this.scan = scan;
        this.birdbase = birdbase;
    }
 
    public void start() {
 
        while (true) {
            String command = askUserInput("?");
 
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("One")) {
                printOne();
            } else if (command.equals("All")) {
                printAll();
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
 
    public String askUserInput(String prompt) {
        System.out.print(prompt + " ");
        return scan.nextLine();
    }
 
    public void add() {
        String name = askUserInput("Name:");
        String nameInLatin = askUserInput("Name in Latin:");
 
        birdbase.add(name, nameInLatin);
    }
 
    public void observation() {
        String name = askUserInput("Name:");
 
        boolean wasSuccessfull = birdbase.observation(name);
        if (!wasSuccessfull) {
            System.out.println(name + "is not a bird!");
        }
    }
 
    public void printOne() {
        String name = askUserInput("Name:");
        String birdToPrint = birdbase.getOne(name);
        if (birdToPrint == null) {
            System.out.println(name + " is not a bird!");
        } else {
            System.out.println(birdToPrint);
        }
    }
 
    public void printAll() {
        System.out.print(birdbase.getAll());
    }
 
}
 import java.util.Scanner;
 
public class mainProgram {
 
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
 
        Scanner scan = new Scanner(System.in);
 
        BirdDatabase birdbase = new BirdDatabase();
 
        UserInterface ui = new UserInterface(scan, birdbase);
        ui.start();
    }
 
}
