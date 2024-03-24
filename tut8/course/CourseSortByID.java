package tut8.course;

import java.util.Comparator;

public class CourseSortByID implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        int compare = c1.getCourseID().compareTo(c2.getCourseID());
        if(compare != 0) {
            return compare;
        }

        return 0;
    }
}
