
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> rawGrades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.rawGrades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.rawGrades.add(points);
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

    public double averageOfGrades() {
        if(grades.isEmpty()){
            return -1;
        }
        
        if (grades != null) {
            int count = 0;
            double total = 0;
            for (int grade : grades) {
                total += grades.get(count);
                count++;
                
            }
            return (double) total / count;
        }
        return -1;
    }
    
    public double averageOfPoints(){
        
        if(rawGrades.isEmpty()){
            return -1;
        }
        if(rawGrades!=null){
            int count = 0;
            double total = 0;
            for (int grade : rawGrades) {
                total += rawGrades.get(count);
                count++;
                
            }
            return (double) total / count;
        }
        
        return -1;
    }
}
