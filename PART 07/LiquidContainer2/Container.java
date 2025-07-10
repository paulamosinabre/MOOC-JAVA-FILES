
public class Container {

    private int liquid;

    public int contains() {
        return this.liquid;
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
        return this.liquid + "/100";
    }
}
