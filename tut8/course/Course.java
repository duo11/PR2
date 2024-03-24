package tut8.course;


import tut8.student.Student;

import java.util.List;

/**
 * Domain constrains table
 *
 *  -----------------------------------------------------------------------------
 * | Class |  Attribute  |    type    |  mutable | optional | length | min | max |
 * |-----------------------------------------------------------------------------|
 * | Course| CourseID    | Integer    |   False  |   False  |        |  1  |     |
 * |       | name        | String     |   False  |   False  |   50   |     |     |
 * |       | credits     | Integer    |   true   |   true   |        |  1  |     |
 * |       | department  | Department |   True   |   True   |   30   |     |     |
 * |       | semester    | Semester   |   True   |   True   |   10   |     |     |
 * ------------------------------------------------------------------------------
 *
 *  */



public class Course implements StudentManagable {
    private Integer courseID;
    private String name;
    private Integer credits;
    private Department department;
    private Semester semester;

    private List<Student> students;

    // Constructor
    public Course(Integer courseID, String name, Integer credits, Department department, Semester semester) {
        this.courseID = courseID;
        this.name = name;
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    // Getters and Setters
    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", semester=" + semester +
                '}';
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public List<Student> getEnrolledStudents() {
        return students;
    }
}