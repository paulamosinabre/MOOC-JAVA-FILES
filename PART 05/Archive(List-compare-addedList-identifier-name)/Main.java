
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String identifier = "", name = "";
        ArrayList<Archive> list = new ArrayList<>();
        int items = 0;
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            
            if(identifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            Archive archive = new Archive(identifier, name);
            
            if(identifier.equals(archive)){
                System.out.println("same identifier");
            }
            
            if(list.contains(archive)){
            }
            
            list.add(archive);
            
        }
        System.out.println("==Items==");
       
       for(Archive archive: list){
           System.out.println(archive.getIdentifier () + ": " + archive.getName());
       }
    }
}
