
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list = new ArrayList<>();
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        for(String lists: list){
            System.out.println(list.indexOf(lists) + 1 + ": " + lists);
        }
        System.out.println("");
    }
    
    public void remove(int number){
        list.remove(number - 1);
    }
}
