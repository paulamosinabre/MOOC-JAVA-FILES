public class Cube {
    private int num;
    private int volume;
    
    public Cube(int num){
        this.num = num;
    }
    
    public int volume(){
        return this.volume = num * num * num; // NO NEED TO DO THIS. KAHIT NUM * NUM * NUM NA LANG
    }
    
    public String toString(){
        return "The length of the edge is " + num + " and the volume " + volume(); // BAKIT HINDI THIS.VOLUME? KASI MAGIGING OUTPUT NIYA 0
    }
}

