
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus (Money addition){
        Money newMoney = new Money(this.euros, this.cents);
        newMoney.euros = addition.cents + this.cents + addition.euros + this.euros;
        
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;
        return new Money(totalsEuros, totalCents);
    }
    
    public Money minus (Money subtraction) {

    }
}
