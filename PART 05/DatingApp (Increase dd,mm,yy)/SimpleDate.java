public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        
        this.day++;
        
        if (this.day > 30){
            this.day -= 30;
            this.month++;
            
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }
      
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;

        while (this.day > 30) {
            this.day -= 30;
            this.month++;
            
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        int advanceDate = newDate.day + days;

        newDate.day += days;

        // Adjust the month if days exceed 30
        while (newDate.day > 30) {
            newDate.day -= 30; // Reset days
            newDate.month++; // Move to the next month

            // Adjust the year if month exceeds 12
            if (newDate.month > 12) {
                newDate.month = 1;
                newDate.year++;
            }
        }

        return newDate;
    }
}
