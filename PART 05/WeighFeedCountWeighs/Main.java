
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation station = new HealthStation(); 
        Person p1 = new Person("Peter", 33, 175, 78); 
        station.weigh(p1);
        System.out.println(station.weighings());
        
        Person kai = new Person("kai", 19, 175, 60);
        HealthStation health = new HealthStation();

        System.out.println(kai.getName() + "'s weight: " + health.weigh(kai) + " kilos");
        health.feed(kai);
        System.out.println(kai.getName() + "'s weight: " + health.weigh(kai) + " kilos");
        
        health.weigh(kai);
        health.weigh(kai);
        System.out.println("weighings performed: " + health.weighings());
    }
}
