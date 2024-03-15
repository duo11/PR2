package tut7.library;


/*
 ___________________________________________
|                   Date                    |
 -------------------------------------------
| - date: String                            |
| - day: int                                |
| - month: int                              |
| - year: int                               |
 -------------------------------------------
| + Date(date: String)                      |
| + isLeapYear(year: int): boolean          |
| + isValidDate(date: String): boolean      |
| + after(date: Date): boolean              |
| + toString(): String                      |
 -------------------------------------------

 */

public class Date {
    private String date;
    private int day;
    private int month;
    private int year;
    public Date(String date){

        if(isValidDate(date)){
            this.date = date;
            this.day = Integer.parseInt(date.substring(0,2));
            this.month = Integer.parseInt(date.substring(3,5));
            this.year = Integer.parseInt(date.substring(6,10));
        }



    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(String date) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}";
        if(date.matches(regex)){

            int day = Integer.parseInt(date.substring(0,2));
            int month = Integer.parseInt(date.substring(3,5));
            int year = Integer.parseInt(date.substring(6,10));

            int dayOfFeb;
            if(isLeapYear(year)){
                dayOfFeb = 29;
            }
            else{
                dayOfFeb = 28;
            }

            if(month == 2 && day > dayOfFeb){
                throw new IllegalArgumentException(month+ "/" + year + " just have " + dayOfFeb +" days");
            }

            if(month <= 12 && day <= 31){
//                System.out.println("Set day " + date + " successfully");
                return true;
            }
            else{
                throw new IllegalArgumentException("Invalid day");
            }
        }
        else{
            System.out.println("Can't set date. Wrong format (dd/mm/yyyy)");
            return false;
        }
    }
    public boolean after(Date date) {
        if (this.year != date.year) {
            return this.year > date.year;
        } else if (this.month != date.month) {
            return this.month > date.month;
        } else {
            return this.day > date.day;
        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +"}";
    }
}
