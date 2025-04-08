
public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();
         
        System.out.println(s.isEmpty());  // Should print: true
        s.add("this");
        System.out.println(s.values());   // Should print: []
        
        s.add("Value");
        
        System.out.println(s.isEmpty());  // Should print: false
        System.out.println(s.values());   // Should print: [Value]
    
        // Try out your class here
        
    }
}
