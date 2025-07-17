
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Grade grade = new Grade();
        System.out.println("Enter totals, -1 stops: ");
        int num;
        while(true){
            num = scanner.nextInt();
            
            if(num == -1){
                System.out.println("Point average (all): " +grade.getAverage());
                System.out.println("Point average (passed):" + grade.getPassingAverage());
                System.out.println("Pass percentage: " + grade.getPassPercentage());
                break;
                
            }
            
            grade.calculateAverage(num);
        }
        
    }
}
