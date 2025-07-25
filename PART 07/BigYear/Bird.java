
import java.util.ArrayList;


public class Bird {
    String name, latin;
    int observation;
   
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
    }
    public String getName(){
        return name;
    }
    public void observe(){
        observation++;
    }
        
    public String toString(){ 
        return name + " (" + latin + "): " + observation + " observations";
    }
}
