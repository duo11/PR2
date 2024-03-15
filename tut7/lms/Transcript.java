package tut7.lms;


/*       _________________________________________
        |                Transcript               |
        |-----------------------------------------|
        | - student: Student                      |
        | - grade: double                         |
        |-----------------------------------------|
        | + Transcript(student: Student,          |
        |               grade: double)            |
        | + getStudentName(): String              |
        | + getGrade(): double                    |
        | + setGrade(grade: double): void         |
        | + isValidGrade(grade: double): boolean  |
        | + toString(): String                    |
         -----------------------------------------
*/

public class Transcript {
    // Attributes
    private Student student;
    private double grade;

    // Constructor
    public Transcript(Student student, double grade) {
        this.student = student;
        this.grade = grade;
    }

    public String getStudentName() {
        return student.getName();
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(isValidGrade(grade)){
        this.grade = grade;
            System.out.println("Set grade success");
        }
        else{
            System.out.println("Can't set ");
        }

    }

    public static boolean isValidGrade (double grade) {

        return grade >= 0 && grade <= 10;
    }

    @Override
    public String toString() {
        return student.getName() + ": " + grade;
    }
}

