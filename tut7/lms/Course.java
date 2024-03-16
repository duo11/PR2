package tut7.lms;

/*       _____________________________________________________________________
        |                               Course                                |
        |---------------------------------------------------------------------|
        | - courseID: int                                                     |
        | - name: String                                                      |
        | - description: String                                               |
        | - credit: int                                                       |
        | - academicTranscript: List<Transcript>                              |
        |---------------------------------------------------------------------|
        | + Course(courseID: int,                                             |
        |           name: String,                                             |
        |           description: String,                                      |
        |           credit: int,                                              |
        |           academicTranscript: List<Transcript>)                     |
        | + getCourseID(): int                                                |
        | + setCourseID(courseID: int): void                                  |
        | + getName(): String                                                 |
        | + setName(name: String): void                                       |
        | + getDescription(): String                                          |
        | + setDescription(description: String): void                         |
        | + getCredit(): int                                                  |
        | + setCredit(credit: int): void                                      |
        | + getAcademicTranscript(): List<Transcript>                         |
        | + printAcademicTranscript(): void                                   |
        | + setAcademicTranscript(academicTranscript: List<Transcript>): void |
         ---------------------------------------------------------------------
*/


import java.util.List;

public class Course {
    // Attributes
    private int courseID;
    private String name;
    private String description;
    private int credit;
    private List<Transcript> academicTranscript;

    // Constructor
    public Course(int courseID, String name, String description, int credit, List<Transcript> academicTranscript) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.credit = credit;
        this.academicTranscript = academicTranscript;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if(credit < 0 || credit > 5) {
            throw new IllegalArgumentException("Credit must be between 1 and 5");
        }
        this.credit = credit;
    }

    public List<Transcript> getAcademicTranscript() {

        return academicTranscript;
    }
    public void printAcademicTranscript() {
        System.out.println("Academic transcript of "+ getName()+": ");
        for(Transcript transcript : academicTranscript){
            System.out.println(transcript);
        }
    }

    public void setAcademicTranscript(List<Transcript> academicTranscript) {
        this.academicTranscript = academicTranscript;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", credit=" + credit +
                ", academicTranscript=" + academicTranscript.toString() +
                '}';
    }
}

