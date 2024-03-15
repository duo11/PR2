package tut7.lms;

import tut7.library.Date;

import java.util.ArrayList;
import java.util.List;

public class LearningManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(1,"duong",new Date("10/12/2004"),3.5);
        Student s2 = new Student(2,"tuan",new Date("26/11/2004"),3.3);
        Student s3 = new Student(3,"dinh",new Date("14/12/2004"),3.6);
        Student s4 = new Student(4,"hieu",new Date("23/07/2004"),4.0);




        List<Transcript> list = new ArrayList<>();
        list.add(new Transcript(s1,6.0));
        list.add(new Transcript(s2,7.0));
        list.add(new Transcript(s3,8.0));
        list.add(new Transcript(s4,9.0));

        Course c1 = new Course(1,"toan","cap1",100,list);
        Course c2 = new Course(2,"van","cap3",100,list);
        Course c3 = new Course(3,"sinh","cap4",100,list);
        Course c4 = new Course(4,"su","cap0",100,list);

        //print c1
        System.out.print("Course 1: ");
        System.out.println(c1);

        //print academic transcript of course c1
        c1.printAcademicTranscript();

        //s1 enroll course c1,c2,c3
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.enrollCourse(c3);

        //print s1
        System.out.print("Student 1: ");
        System.out.println(s1);
        //s2 enroll course c3,c4
        s2.enrollCourse(c3);
        s2.enrollCourse(c4);

        //print enrolled course of student1 and 2
        System.out.println(s1.getName() + " had enrolled these courses: " + s1.getEnrolledCourses());
        System.out.println(s2.getName() + " had enrolled these courses: " + s2.getEnrolledCourses());




    }

}
