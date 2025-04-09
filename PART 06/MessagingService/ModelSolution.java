import java.util.ArrayList;
 
public class MessagingService {
 
    private ArrayList<Message> messages;
 
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
 
    public void add(Message message) {
      //used greater than symbol instead of less than or equal
        if (message.getContent().length() > 280) {
            return;
        }
 
        this.messages.add(message);
    }
 
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
 
