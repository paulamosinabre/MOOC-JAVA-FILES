
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        
        System.out.println("Manhattan Studio: " + manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println("Atlanta Studio vs Bangor: " + atlantaTwoBedroomApt.largerThan(bangorThreeBedroomApt));
        System.out.println("Bangor vs Manhattan: " + bangorThreeBedroomApt.largerThan(manhattanStudioApt) );
        System.out.println("Atlanta vs Manhattan: " + atlantaTwoBedroomApt.largerThan(manhattanStudioApt));
    }
}
