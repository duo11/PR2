package tut8.course;
import tut8.student.Student;

import java.util.List;
public interface StudentManagable {
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(Student student);
    List<Student> getEnrolledStudents();
}
