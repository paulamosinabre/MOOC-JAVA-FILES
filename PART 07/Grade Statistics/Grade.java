import java.util.ArrayList;

public class Grade {
    private double grade, passedGrade, totalCount, passedCount;
    private ArrayList<Integer> points;

    public Grade(){
        this.grade = 0;
        this.passedGrade = 0;
        this.totalCount = 0;
        this.passedCount = 0;
        this.points = new ArrayList<>();
    }

    public void addGrade(double grade){
        if(grade >= 50 && grade <= 100){
            this.passedGrade += grade;
            passedCount++;
            
        }
        if(grade > 0 && grade <= 100){
            this.grade += grade;
            totalCount++;
            this.points.add(getPoint((int) grade));
        }
        
    }

    public double getAverage(){
        if (totalCount == 0) return 0;
        return grade / totalCount;
    }

    public double getPassingAverage(){
        if (passedCount == 0) return 0;
        return passedGrade / passedCount;
    }

    public double getPassPercentage(){
        if (totalCount == 0) return 0;
        return 100.0 * passedCount / totalCount;
    }

    public int getPoint(int grade){
        if(grade >= 90 && grade <= 100){
            return 5;
        } else if(grade >= 80){
            return 4;
        } else if(grade >= 70){
            return 3;
        } else if(grade >= 60){
            return 2;
        } else if(grade >= 50){
            return 1;
        } else {
            return 0;
        }
    }

    public void gradeDistribution(){
        for(int i = 5; i >= 0; i--){
            int count = 0;
            for(int point : points){
                if(point == i){
                    count++;
                }
            }
            System.out.print(i + ": ");
            for(int j = 0; j < count; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
