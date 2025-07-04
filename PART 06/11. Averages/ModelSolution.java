import java.util.ArrayList;
 
public class GradeRegister {
 
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
 
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }
 
    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }
 
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
 
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
 
        return 1.0 * sum / this.grades.size();
    }
 
    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
 
        int sum = 0;
        for (int p : this.points) {
            sum = sum + p;
        }
 
        return 1.0 * sum / this.points.size();
    }
 
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }
}

import java.util.Scanner;
 
public class UserInterface {
 
    private GradeRegister register;
    private Scanner scanner;
 
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
 
    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }
 
    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            int points = Integer.valueOf(input);
 
            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }
 
            this.register.addGradeBasedOnPoints(points);
        }
    }
 
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
 
            grade = grade - 1;
        }
        
        System.out.println("Average of grades: " + register.averageOfGrades());
        System.out.println("Average of points: " + register.averageOfPoints());        
    }
 
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
