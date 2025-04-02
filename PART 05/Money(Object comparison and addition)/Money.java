
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

    public Money plus(Money addition) {
        //Money newMoney = new Money(this.euros, this.cents);
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {

        Money comparedMoney = (Money) compared;

        // First, compare the euros
        if (this.euros < compared.euros) {
            return true;
        }
        // If euros are the same, compare the cents
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {

        int totalCents = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);

        // Ensure money never goes negative (optional, depends on use case)
        if (totalCents < 0) {
            return new Money(0, 0);
        }

        int newEuros = totalCents / 100;  // Get euros
        int newCents = totalCents % 100;  // Get remaining cents

        return new Money(newEuros, newCents);
    }
}
