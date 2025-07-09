
public class Container {

    private int liquid;

    public Container() {

    }

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.liquid += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.liquid -= amount;
        }
    }

    public String toString() {
        return liquid + " /100";
    }
}
