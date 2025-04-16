import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        
        //to store the weight entered by the user
        int totalWeight = 0;
        //create an instance variable for gift class, so you can access the gift class methods.
        for(Gift gift: gifts){
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
