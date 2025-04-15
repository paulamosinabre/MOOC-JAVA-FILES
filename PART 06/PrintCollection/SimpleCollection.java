
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String printCollection;
        
        if(elements.size() > 1){
            printCollection = "The collection " + this.name + " has " + elements.size() + " elements:\n";
        } else {
            printCollection = "The collection " + this.name + " has " + elements.size() + " element:\n";
        }
        
        
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String printAlphabet = "";
        
        for(String alphabet: elements){
            printAlphabet = printAlphabet + alphabet + "\n";
        }
        return printCollection + printAlphabet;
    }
}
