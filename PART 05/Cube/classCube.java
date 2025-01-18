
public class Cube {
    private int num;
    private int volume;
    
    public Cube(int num){
        this.num = num;
    }
    
    public int volume(){
        return volume = num * num * num;
    }
    
    public String toString(){
        return "The length of the edge is " + num + " and the volume " + volume;
    }
}
