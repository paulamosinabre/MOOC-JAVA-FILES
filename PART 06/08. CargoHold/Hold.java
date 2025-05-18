
import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight; 
    }        
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() < maxWeight) {
            return;
        }
        suitcases.add(suitcase);
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        for(Suitcase suitcase: suitcases){
            totalWeight += suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
