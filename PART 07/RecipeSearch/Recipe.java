
import java.util.ArrayList;

public class Recipe {

    String name;
    int time;
    ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void searchFor(String search) {
        if (name.contains(search)) {
            System.out.println(name + ", cooking time: " + time);
        }
    }

    public void searchTime(int search) {
        if (search >= time) {
            System.out.println(name + ", cooking time: " + time);
        }
    }

    public void searchIngredient(String search) {

        if (ingredients.contains(search)) {
            System.out.println(name + ", cooking time: " + time);
        }
    }
}
