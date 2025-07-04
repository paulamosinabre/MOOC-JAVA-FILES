
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        for(String joke: jokes){
            System.out.println(joke);
        }
    }
}
