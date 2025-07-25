
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> list = new ArrayList<>();

        while (true) {

            System.out.println("?");
            String cmd = scan.nextLine();

            if (cmd.equalsIgnoreCase("quit")) {
                break;
            }

            if (cmd.equalsIgnoreCase("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();

                System.out.println("Name in latin: ");
                String latin = scan.nextLine();
                Bird bird = new Bird(name, latin);
                list.add(bird);
            } else if (cmd.equalsIgnoreCase("Observation")) {
                System.out.println("Bird? ");
                String observe = scan.nextLine();
                boolean found = false;
                for (Bird b : list) {
                    if (b.getName().equals(observe)) {
                        b.observe();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }
            } else if (cmd.equalsIgnoreCase("All")) {
                for (Bird b : list) {
                    System.out.println(b);
                }
            } else if (cmd.equalsIgnoreCase("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                boolean found = false;
                for (Bird b : list) {
                    if (b.getName().equals(bird)) {
                        System.out.println(b);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }
            }

        }

    }

}
