
public class ClockHand {

    private int value; //ito young value ng seconds or hundredths of seconds. basta anything na magcacall sa kaniya
    private int limit; // the limit the specific type

    public ClockHand(int limit) {
        this.limit = limit; //para sa another class, mag i-initialize ng clockhand with an argument inside which is the limit
        this.value = 0; //starts at zero
    }

    public void advance() {
        this.value = this.value + 1; //matic mag pplus 1 once .advance it called

        if (this.value >= this.limit) { //condition para kapag yung value is nag exceed or equals na sa limit, magseset to 0
            this.value = 0;
        }
    }

    public int value() { // return na yung value
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
