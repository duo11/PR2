package tut8.person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {

        int nameComparison = p1.getName().compareTo(p2.getName());

        if(nameComparison != 0){
            return nameComparison;
        }

        return 0;
    }
}


