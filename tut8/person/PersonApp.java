package tut8.person;

import tut8.course.Department;
import tut8.course.Semester;
import tut8.student.Student;
import tut8.course.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {


        Person person1 = new Person(1,"duong","12/12/2004","duong01659818134@icloud.com","0932123763","Vietnam");
        Person person2 = new Person(2,"tuan","11/12/2004","hieu123@gmail.vn","0532121313","Indonesia");
        Person person3 = new Person(3,"huan","13/12/1999","123tuanbipp@ms.hanu.edu.vn","0332187121","ThaiLand");
        Person person4 = new Person(4,"Duan","10/12/2010","duana2398asd@gmail.com","0983741268","England");

        Course pr1 = new Course(1,"pr1",3, Department.COMPUTER_SCIENCE, Semester.WINTER);
        Course prm = new Course(1,"prm",2, Department.COMPUTER_SCIENCE, Semester.SUMMER);
        Course pst = new Course(1,"pst",4, Department.COMPUTER_SCIENCE, Semester.FALL);

        List<Course> courseList4 = new ArrayList<>();
        List<Course> courseList5 = new ArrayList<>();
        List<Course> courseList6 = new ArrayList<>();

        courseList4.add(pr1);
        courseList4.add(prm);
        courseList5.add(prm);
        courseList5.add(pst);
        courseList6.add(pr1);
        courseList6.add(pst);


        Student student1 = new Student(10,"tien","03/11/2001","tiennnnnnbip@yahoo.com","0932123763","Germany",220104036,courseList6,3.7);
        Student student2 = new Student(20,"hung","03/11/2002","hungas@gmail.xyzz","0932123763","America",220104012,courseList5,3.5);
        Student student3 = new Student(15,"dinh","03/11/2006","dinhhhhaoo@apple.vn","0932123763","Japan",220104058,courseList4,4.0);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list,new NameComparator());
        System.out.println("Sort by name:");
        for (Person person : list){
            System.out.println(person);
        }
        Collections.sort(list,new AgeComparator());
        System.out.println();
        System.out.println("Sort by age:");
        for (Person person : list){
            System.out.println(person);
        }



    }
}
