import java.util.ArrayList;
 
public class Hold {
 
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
 
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
 
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maximumWeight) {
            return;
        }
 
        this.suitcases.add(suitcase);
    }
 
    public int totalWeight() {
        int sum = 0;
        int index = 0;
        while (index < this.suitcases.size()) {
            sum += this.suitcases.get(index).totalWeight();
            index++;
        }
        return sum;
    }
 
    public void printItems() {
        int index = 0;
        while (index < this.suitcases.size()) {
            this.suitcases.get(index).printItems();
            index++;
        }
    }
 
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
 
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
 
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

public class Item {
 
    private String name;
    private int weight;
 
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
 
    public String getName() {
        return this.name;
    }
 
    public int getWeight() {
        return this.weight;
    }
 
    @Override
    public String toString() {
        return this.name + ": (" + this.weight + " kg)";
    }
}

import java.util.ArrayList;
 
public class Suitcase {
 
    private int maximumWeight;
    private ArrayList<Item> items;
 
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
 
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.maximumWeight) {
            return;
        }
 
        this.items.add(item);
    }
 
    public int totalWeight() {
        int sum = 0;
        int index = 0;
        while (index < this.items.size()) {
            sum += this.items.get(index).getWeight();
            index++;
        }
        return sum;
    }
 
    public void printItems() {
        int index = 0;
        while (index < this.items.size()) {
            Item t = this.items.get(index);
            System.out.println(t);
            index++;
        }
    }
 
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
 
        Item heaviest = this.items.get(0);
        int index = 0;
        while (index < this.items.size()) {
            Item t = this.items.get(index);
            
            if(t.getWeight() > heaviest.getWeight()) {
                heaviest = t;
            }
            
            index++;
        }
        
        return heaviest;
    }
 
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
 
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
 
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
