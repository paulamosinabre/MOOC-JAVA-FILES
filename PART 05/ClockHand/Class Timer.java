
public class Timer {

    private ClockHand hundredthsSeconds; //bc we are going to use this class para matrack or ma-update yung status niya once it is running
    private ClockHand seconds;

    public Timer() {
        this.hundredthsSeconds = new ClockHand(100); //initialize the limit, mapapasa siya sa Clockhand class
        this.seconds = new ClockHand(60);
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsSeconds + "";
    }

    public void advance() {
        this.hundredthsSeconds.advance(); //mag-iincrease always yung hundredths seconds since gumamit ng .advance() method
        if (this.hundredthsSeconds.value() == 0) { //since na reach niya na yung 100, uulit na yung hundredths seconds sa 0. then mag iincrease yung seconds
            this.seconds.advance(); //saka lang siya mag-iincrease once na reach yung 100
            
            if (this.seconds.value() == 0) { //kapag 0 siya, 0 siya
                this.seconds.value();
            }
        }

    }
}
