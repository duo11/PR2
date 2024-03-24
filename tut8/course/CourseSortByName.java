package tut8.course;

import java.util.Comparator;

public class CourseSortByName implements Comparator<Course> {

    @Override
    public int compare(Course c1, Course c2) {

        int nameComparator = c1.getName().compareTo(c2.getName());

        if(nameComparator != 0) {
            return nameComparator;
        }
        return 0;
    }
}
