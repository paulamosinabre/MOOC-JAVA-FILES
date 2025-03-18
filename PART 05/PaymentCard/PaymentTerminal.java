
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
        //compare it with payment instead of money since it needs to see the exact change not including the 1000 php 
       if(payment >= 2.5){
          money += 2.5;
          affordableMeals++;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 4.30){
            money += 4.30;
            heartyMeals++;
             return payment - 4.30;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(card.balance() >= 4.30){
            //error: card is only a reference variable (PaymentCard card = new())
            //so if you want to access the balance, you are going to us.e card.balance();
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }
        
    }
    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
