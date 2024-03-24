package tut8.lms;

import tut8.student.Student;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compare = o1.getName().compareTo(o2.getName());
        return compare;
    }
}
