
import java.util.ArrayList;
import java.util.ListIterator;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {

       if(!list.isEmpty()){
          return list.remove(list.size() - 1);
       }
       return null;
    }
}
