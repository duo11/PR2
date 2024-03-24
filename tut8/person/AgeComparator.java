package tut8.person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {

        int[] arr1 = stringToArray(p1.getDateOfBirth());
        int[] arr2 = stringToArray(p2.getDateOfBirth());

        int yearComparator = arr2[2] - arr1[2];
        int monthComparator = arr2[1] - arr1[1];
        int dayComparator = arr2[0] - arr1[0];

        if(yearComparator == 0){
            if(monthComparator == 0){
                return dayComparator;
            }
            else{
                return monthComparator;
            }
        }
        else{
            return yearComparator;
        }
    }

    public int[] stringToArray(String Dob){
        int day = Integer.parseInt(Dob.substring(0,2));
        int month = Integer.parseInt(Dob.substring(3,5));
        int year = Integer.parseInt(Dob.substring(6,10));

        int[] arr = new int[3];
        arr[0] = day;
        arr[1] = month;
        arr[2] = year;
        return arr;
    }


}
