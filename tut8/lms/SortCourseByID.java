package tut8.lms;

import tut8.course.Course;

import java.util.Comparator;

public class SortCourseByID implements Comparator<Course> {
    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCourseID() - o2.getCourseID();
    }
}
