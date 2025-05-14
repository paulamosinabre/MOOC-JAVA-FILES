
import java.util.ArrayList;

/*
Constructor, to which the maximum weight is provided

The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.

The method public String toString(), which returns the string "x items (y kg)
 */
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) { this.maximumWeight = maximumWeight; }

    public void addItem(Item item) {
        int currentWeight = 0;
        for (Item i : items) {
            currentWeight += i.getWeight();
        }

        if (currentWeight + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    public String toString() {

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();

        }
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems(){
        for(Item item: items){
            System.out.println(item.getItem() + "(" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item item: items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public String heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        int item = items.get(0);
        for(Item element: items){
            if(element.getWeight() > this.items()){
                item = element;
            }
        }
        return item;
    }
}
