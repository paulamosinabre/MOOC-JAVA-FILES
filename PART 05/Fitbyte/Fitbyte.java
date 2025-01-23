
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((200 - age) - (restingHeartRate)) * (percentageOfMaximum) + restingHeartRate;
    }
}
