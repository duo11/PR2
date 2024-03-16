package tut7.lms;

//        __________________________________________________
//        |                   Student                       |
//        |-------------------------------------------------|
//        | - studentID: Integer                            |
//        | - name: String                                  |
//        | - dateOfBirth: Date                           |
//        | - gpa: Double                                   |
//        | - enrolledCourses: List<Course>                 |
//        |-------------------------------------------------|
//        | + Student(studentID: Integer,                   |
//        |            name: String,                        |
//        |            dateOfBirth: Date)                 |
//        | + Student(studentID: Integer,                   |
//        |            name: String,                        |
//        |            dateOfBirth: Date,                   |
//        |            gpa: Double,                         |
//        |            enrolledCourses: List<Course>)       |
//        | + getStudentID(): Integer                       |
//        | + getName(): String                             |
//        | + getGpa(): double                              |
//        | + getDateOfBirth(): Date                        |
//        | + getEnrolledCourses(): String                  |
//        | + setStudentID(id: Integer): void               |
//        | + setName(name: String): void                   |
//        | + setDateOfBirth(dateOfBirth: Date): void       |
//        | + setGpa(gpa: double): void                     |
//        | + enrollCourse(enrolledCourse: Course): void    |
//        | - isValidStudentID(id: Integer): boolean        |
//        | + static isValidName(name: String): boolean     |
//        | + static isValidGpa(gpa: Double): boolean       |
//        |_________________________________________________|

import java.util.ArrayList;
import java.util.List;
import tut7.library.Date;
public class Student {
    private Integer studentID ;
    private String name;
    private Date dataOfBirth;
    private Double gpa;
    private List<Course> enrolledCourses;


    public Student(Integer studentID, String name, Date dataOfBirth) {
        if(!isValidStudentID(studentID)){
            throw new IllegalArgumentException("Invalid Id");
        }
        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid name");
        }
        this.studentID = studentID;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.gpa = 0.0;
        this.enrolledCourses = new ArrayList<>();
    }

    public Student(Integer studentID, String name, Date dataOfBirth,Double gpa) {

        if(!isValidStudentID(studentID)){
            throw new IllegalArgumentException("Invalid Id");
        }
        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid name");
        }
        if(!isValidGpa(gpa)){
            throw new IllegalArgumentException("Invalid GPA");
        }

        this.studentID = studentID;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();

    }

    public Integer getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public String getEnrolledCourses() {

        if(enrolledCourses.size() == 0){
            return "No courses";
        }

        StringBuilder s1 = new StringBuilder();
        for(Course course : enrolledCourses){
            s1.append(course.getName()+ " ");
        }
        return s1.toString();

    }

    public void setStudentID(Integer id) {
        if(isValidStudentID(id)) {
            System.out.println("Set id successfully");
            this.studentID = id;
        }
        else{
            System.out.println("Can't set");
        }
    }

    public void setName(String name) {
        if(isValidName(name)){
            this.name = name;
        }
    }

    public void setDataOfBirth(Date dataOfBirth) {
            this.dataOfBirth = dataOfBirth;
    }

    public void setGpa(double gpa) {
        if(isValidGpa(gpa)){
            System.out.println("Set gpa successfully");
            this.gpa = gpa;
        }
        else{
            System.out.println("Gpa must be between 0 and 10");
        }
    }

    public void enrollCourse(Course enrolledCourses) {
        this.enrolledCourses.add(enrolledCourses);
    }


    private boolean isValidStudentID (Integer id) {
        return id > 0;
    }

    public static boolean isValidName (String name){
        if(name.matches("^[a-zA-Z]+$")){
            if(name.length() <= 50){
                System.out.println("Set name successfully");
                return true;
            }
            else{
                System.out.println("Name cannot exceed 50 characters");
                return false;
            }
        }
        else{
            System.out.println("Wrong name format");
            return false;
        }

    }

    public static boolean isValidGpa (Double gpa) {

        return gpa >= 0 && gpa <= 10;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", gpa=" + gpa +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
