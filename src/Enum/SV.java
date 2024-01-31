package Enum;

public class SV
{
    private int id;
    private String name;
    private double average_score;
    private Grade grade;

    public SV(int id, String name, double average_score) {
        this.id = id;
        this.name = name;
        this.average_score = average_score;
        this.grade = getGrade();
    }

//    get grade
    public Grade getGrade() {
        if(this.average_score >= 8) {
            grade = Grade.gioi;
        }
        else if (this.average_score >= 6.5) {
            grade = Grade.kha;
        }
        else if(this.average_score >= 4.5) {
            grade = Grade.tb;
        }
        else if(this.average_score >= 3.0){
            grade = Grade.yeu;
        }
        else {
            grade = Grade.kem;
        }
        return grade;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + average_score +"\t"+ this.grade.des();
    }
}
