public class HealthStation {

   private int weigh;
   
   public HealthStation(){
       this.weigh = 0;
   }
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weigh++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings(){
        return this.weigh;
    }
}
