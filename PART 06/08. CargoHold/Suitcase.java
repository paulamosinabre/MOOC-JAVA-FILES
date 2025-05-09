
import java.util.ArrayList;

/*
Constructor, to which the maximum weight is provided

The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.

The method public String toString(), which returns the string "x items (y kg)
 */
public class Suitcase {
    
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        if(this.maximumWeight > item.getWeight()) items.add(item);
    }
   
    public String toString(){
        if(items.isEmpty()) return "0 items (0 kg)";
        
        int num = 0;
        int numberOfItems = 0;
        int totalWeight = 0;
        Item toBeReturned = this.items.get(num);
        for(Item item: items){
            if(this.maximumWeight > item.getWeight()){
                totalWeight = item.getWeight() + toBeReturned.getWeight();
                num++;
                numberOfItems++;
            } else {
                return numberOfItems + " items (" + totalWeight + ")";
            }
        }
        return numberOfItems + " items (" + totalWeight + ")";
    }
}
