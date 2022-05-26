interface Analyzable{
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}

class GradedActivity {

    private double score;

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}

class CourseGrades implements Analyzable {

    private GradedActivity[] grades;

    public GradedActivity[] getGrades() {
        return grades;
    }

    public void setGrades(GradedActivity[] grades) {
        this.grades = grades;
    }

    public double getAverage() {
        int suma = 0;
        for (GradedActivity gradedActivity : grades) {
            suma += gradedActivity.getScore();
        }
        return suma / grades.length;
    }

    public GradedActivity getHighest() {
        int highestIndex = 0;
        double highestScore = grades[highestIndex].getScore();

        for (int i = highestIndex +1; i < grades.length; i++) {
            if (grades[i].getScore() > highestScore) {
                highestIndex = i;
                highestScore = grades[i].getScore();
            }
        }
        return grades[highestIndex];
    }

    public GradedActivity getLowest() {
        int lowestIndex = 0;
        double lowestScore = grades[lowestIndex].getScore();

        for (int i = lowestIndex +1; i < grades.length; i++) {
            if (grades[i].getScore() < lowestScore) {
                lowestIndex = i;
                lowestScore = grades[i].getScore();
            }
        }

        return grades[lowestIndex];
    }
}

public class Test {
    public static void main(String[] args)  {
        CourseGrades courseGrades = new CourseGrades();
        GradedActivity ocena1 = new GradedActivity();
        ocena1.setScore(100);
        GradedActivity ocena2 = new GradedActivity();
        ocena2.setScore(50);
        GradedActivity ocena3 = new GradedActivity();
        ocena3.setScore(40);
        GradedActivity ocena4 = new GradedActivity();
        ocena4.setScore(70);
        GradedActivity ocena5 = new GradedActivity();
        ocena5.setScore(20);
        courseGrades.setGrades(new GradedActivity[] {ocena1, ocena2, ocena3, ocena4,ocena5});
        System.out.println("Najwyzszy wynik to: "+courseGrades.getHighest().getScore()+" punktów, ocena: "
                +courseGrades.getHighest().getGrade());
        System.out.println("Najniższy wynik to: "+courseGrades.getLowest().getScore()+" punktów, ocena: "
                +courseGrades.getLowest().getGrade());
        System.out.println("Średnia punktów wynosi: "+courseGrades.getAverage());
    }
}
