package tut8.lms;

import tut8.course.Course;
import tut8.course.CourseSortByCredit;
import tut8.course.CourseSortByID;
import tut8.student.Student;

import java.util.*;
import java.time.LocalDate;

public class LearningManagementSystem {
    HashMap<Integer,Student> students;
    HashMap<Integer, Course> courses;

    private int studentNumber = 1;
    private int courseNumber = 1;

    private String currentSeasonYear;



    public LearningManagementSystem() {
        students = new HashMap<>();
        courses = new HashMap<>();
        currentSeasonYear = takeCurrentSeason();
    }
    public LearningManagementSystem(HashMap<Integer, Student> students, HashMap<Integer, Course> courses) {
        this.students = students;
        this.courses = courses;
        studentNumber = students.size();
        courseNumber = courses.size();
        currentSeasonYear = takeCurrentSeason();
    }

    public String takeCurrentSeason(){
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonth().getValue();

        String season = currentDate.getDayOfWeek().name();
        switch (month){
            case 1,2,3:
                season = "SP";
                break;
            case 4,5,6:
                season ="SU";
                break;
            case 7,8,9:
                season = "AU";
                break;
            case 10,11,12:
                season = "Wi";
                break;
        }
        return season + year;


    }

    public HashMap<Integer, Student> getStudents() {
        return this.students;
    }

    public HashMap<Integer, Course> getCourses() {
        return this.courses;
    }
    public String getCurrentSeasonYear(){
        return this.currentSeasonYear;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public void setCourses(HashMap<Integer, Course> courses) {
        this.courses = courses;
    }
    public void addStudent(Student student){
        this.students.put(this.studentNumber++,student);
    }
    public void removeStudent(Integer id){
        this.students.remove(id);
    }
    public void addCourse(Course course){
        this.courses.put(this.courseNumber++,course);
    }
    public void removeCourse(Integer id){
        this.courses.remove(id);

    }
    public Integer searchStudentByName (String name){
        for(Map.Entry<Integer,Student> entry : students.entrySet()){
            if(entry.getValue().getName().equals(name)){
                return entry.getKey();
            }
        }
        return -1;
    }
    public Integer searchStudentByStudentID (int id){
        for(Map.Entry<Integer,Student> entry : students.entrySet()){
            if(entry.getValue().getStudentID() == id){
                return entry.getKey();
            }
        }
        return -1;
    }


    public List<Student> sortStudentsByName () {
        List<Student> list = new ArrayList<>(students.values());
        Collections.sort(list,new SortStudentByName());
        return list;
    }
    public List<Student> sortStudentsByStudentID() {
        List<Student> list = new ArrayList<>(students.values());
        Collections.sort(list,new SortStudentByStudentID());
        return list;
    }
    public List<Course> sortCourseByName() {
        List<Course> list = new ArrayList<>(courses.values());
        Collections.sort(list,new SortCourseByName());
        return list;
    }
    public List<Course> sortCourseByID(){
        List<Course> list = new ArrayList<>(courses.values());
        Collections.sort(list,new SortCourseByID());
        return list;
    }



    @Override
    public String toString() {
        return "LearningManagementSystem{" +
                "students=" + students +
                ", courses=" + courses +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student(10,"tien","03/11/2001","tiennnnnnbip@yahoo.com","0932123763","Germany");

        HashMap<Integer,Student> students = new HashMap<>();
        students.put(1,student1);

    }


}
