package tut8.course;

import java.util.Comparator;

public class CourseSortByCredit implements Comparator<Course> {

    @Override
    public int compare(Course c1, Course c2) {
        int compare = c1.getCredits().compareTo(c2.getCredits());
        if(compare != 0){
            return compare;
        }
        return 0;
    }
}
