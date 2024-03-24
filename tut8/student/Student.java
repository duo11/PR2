package tut8.student;

import tut8.course.Course;
import tut8.person.Person;

import java.util.List;


/**
 * Domain constrains table
 *
 *  ---------------------------------------------------------------------------------------
 * | Classv |  Attribute      |    type      |  mutable | optional | length | min   | max  |
 * |-------------------------------------------------------------------------------------- |
 * | Student| studentID       | Integer      |   False  |   False  |        |  1    |      |
 * |        | enrolledCourses | List<Course> |   true   |   true   |        |       |      |
 * |        | gpa             | Double       |   true   |   true   |        |  0.0  |  4.0 |
 * ---------------------------------------------------------------------------------------
 *
 *  */

public class Student extends Person {



    private Integer studentID;
    private List<Course> enrolledCourses;

    private Double gpa;



    public Student(int id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }
    public Student(int id, String name, String dateOfBirth,String email,String tel,String address) {
        super(id, name, dateOfBirth,email,tel,address);
    }

    public Student(int id, String name, String dateOfBirth,String email,String tel,String address,Integer studentID,List<Course> enrolledCourses,Double gpa) {
        super(id, name, dateOfBirth,email,tel,address);
        if(!isValidStudentID(studentID)){
            throw new IllegalArgumentException("Invalid studentID");
        }
        if(!isValidGpa(gpa)){
            throw new IllegalArgumentException("Invalid GPA");
        }
        if(enrolledCourses == null){
            throw new IllegalArgumentException("Enrolled courses list is null");
        }
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
        this.gpa = gpa;

    }

    public Integer getStudentID() {
        return this.studentID;
    }

    public void setStudentID(Integer studentID) {
        if(!isValidStudentID(studentID)){
            throw new IllegalArgumentException("Invalid studentID");
        }
        this.studentID = studentID;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        if(enrolledCourses != null){
            this.enrolledCourses = enrolledCourses;
        }
        else{
            throw new IllegalArgumentException("Enrolled courses list is null");
        }
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        if(!isValidGpa(gpa)){
            throw new IllegalArgumentException("Invalid gpa");
        }
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{Person{id=" + this.getId() + ", name=" + this.getName() + ", dateOfBirth='" + getDateOfBirth() +"'}," +
                "studentID=" + this.studentID +
                ", enrolledCourses=" + this.enrolledCourses +
                ", gpa=" + this.gpa +
                '}';
    }

    public static boolean isValidStudentID(Integer studentID) {
        return studentID > 0;
    }
    public static boolean isValidGpa(Double gpa) {
        return gpa >= 0 && gpa <= 4;
    }


}
