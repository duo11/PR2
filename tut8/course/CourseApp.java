package tut8.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CourseApp {
    public static void main(String[] args) {
        List<Course> list = new ArrayList<>();

        Course c1 = new Course(1,"pr1",4,Department.COMPUTER_SCIENCE,Semester.WINTER);
        Course c2 = new Course(4,"it",2,Department.MATHEMATICS,Semester.SPRING);
        Course c3 = new Course(2,"pr2",1,Department.MATHEMATICS,Semester.SUMMER);
        Course c4 = new Course(3,"act",3,Department.PHYSICS,Semester.FALL);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        System.out.println("Sort by name:");
        Collections.sort(list,new CourseSortByName());
        for(Course course : list){
            System.out.println(course);
        }

        System.out.println("Sort by id:");
        Collections.sort(list,new CourseSortByID());
        for(Course course : list){
            System.out.println(course);
        }

        System.out.println("Sort by credit:");
        Collections.sort(list,new CourseSortByCredit());
        for(Course course : list){
            System.out.println(course);
        }

    }

}
