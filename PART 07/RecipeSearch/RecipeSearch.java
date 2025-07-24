
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searrches recipe by name\n"
                + "find cooking time - searches recipe by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        ArrayList<Recipe> list = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                if (name.trim().isEmpty()) {
                    continue; // skip any empty lines
                }

                int time = Integer.parseInt(fileReader.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String ingredientLine = fileReader.nextLine();
                    if (ingredientLine.trim().isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredientLine);
                }

                list.add(new Recipe(name, time, ingredients));

            }

        } catch (Exception e) {

        }

        while (true) {
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipes : list) {
                    System.out.println(recipes.getName() + ", cooking time: " + recipes.getTime());
                }
            } else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                
                for(Recipe recipes: list){
                    recipes.searchFor(search);
                }
                
            } else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxTime = scanner.nextInt();
                scanner.nextLine();
                for(Recipe recipes: list){
                    recipes.searchTime(maxTime);
                }
                
            } else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                for(Recipe recipes: list){
                    recipes.searchIngredient(ingredient);
                }
                
            }
            
            
        }
    }

}
