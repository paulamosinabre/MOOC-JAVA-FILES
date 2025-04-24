
import java.util.ArrayList;
import java.util.Collections;

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
        if(this.list.isEmpty()) return null;
        
        Person returnObj = this.list.get(0);
        
        for(Person person: this.list){
            if(person.getHeight() < returnObj.getHeight()) returnObj = person;
        }
        return returnObj;
    }
    
    public Person take(){
        if(this.list.isEmpty()) return null;
        
        Person returnObj = this.list.get(0);
        
        for(Person person: this.list){
            if(person.getHeight() < returnObj.getHeight()) returnObj = person;
        }
        
        //Collections.sort(list);
        return returnObj;
    }
}
