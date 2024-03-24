package tut8.lms;

import tut8.student.Student;

import java.util.Comparator;

public class SortStudentByStudentID implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentID() - o2.getStudentID();
    }
}
