
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> list;
    
    public Room(){
        this.list = new ArrayList<>();
    }
    
    public void add(Person person){
        this.list.add(person);
    }
    
    public boolean isEmpty(){
        if(this.list.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.list;
    }

    public Person shortest(){
    }
}
