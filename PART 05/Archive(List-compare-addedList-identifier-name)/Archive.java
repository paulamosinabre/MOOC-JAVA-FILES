
import java.util.Objects;


public class Archive {
    
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive archiveCompared = (Archive) compared;
        
        if(this.identifier.equals(archiveCompared.identifier) &&
                this.name.equals(archiveCompared.name)){
            return true;
        }
        return false;
    }
}
