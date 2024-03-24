package tut8.lms;

import tut8.course.Course;

import java.util.Comparator;

public class SortCourseByName implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        int compare = o1.getName().compareTo(o2.getName());
        return compare;
    }
}
