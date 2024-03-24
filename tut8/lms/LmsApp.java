package tut8.lms;

import tut8.course.Course;
import tut8.course.Department;
import tut8.course.Semester;
import tut8.student.Student;

import java.util.List;

public class LmsApp {
    public static void main(String[] args) {

        Student student1 = new Student(10,"tien","03/11/2001","tiennnnnnbip@yahoo.com","0932123763","Germany");
        Student student2 = new Student(20,"hung","03/11/2002","hungas@gmail.xyzz","0932123763","America");
        Student student3 = new Student(15,"dinh","03/11/2006","dinhhhhaoo@apple.vn","0932123763","Japan");


        LearningManagementSystem lms = new LearningManagementSystem();
        lms.addStudent(student1);
        lms.addStudent(student2);
        lms.addStudent(student3);

        System.out.println(lms.searchStudentByName("hung"));


        Course c1 = new Course(1,"pr1",4, Department.COMPUTER_SCIENCE, Semester.WINTER);
        Course c2 = new Course(4,"it",2,Department.MATHEMATICS,Semester.SPRING);
        Course c3 = new Course(2,"pr2",1,Department.MATHEMATICS,Semester.SUMMER);
        Course c4 = new Course(3,"act",3,Department.PHYSICS,Semester.FALL);

        lms.addCourse(c1);
        lms.addCourse(c2);
        lms.addCourse(c3);
        lms.addCourse(c4);

        List<Course> sortedList = lms.sortCourseByName();
        for(Course course : sortedList){
            System.out.println(course);
        }

    }
}
