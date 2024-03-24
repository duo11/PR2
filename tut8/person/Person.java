package tut8.person;


/**
------------------------------------------------|
|                Person                         |                                  |
------------------------------------------------|
| - id: int                                     |                                  |
| - name: String                                |                             |
| - dateOfBirth: String                         |                             |
| - email: String                               |
| - tel: String                                 |
| - address: String                             |
------------------------------------------------|
| + Person(id: int,                             |
|            name: String,                      |
|           dateOfBirth: String)                |
| + Person(id: int,                             |
|            name: String,                      |
|            dateOfBirth: String,               |
|            email: String,                     |
|            tel: String,                       |
|            address: String)                   |
| + getId(): int                                |
| + setId(id: int): void                        |
| + getName(): String                           |
| + setName(name: String): void                 |
| + getDateOfBirth(): String                    |
| + setDateOfBirth(dateOfBirth: String): void   |
| + getAge(): Integer                           |
| + getEmail(): String                          |
| + setEmail(email: String): void               |
| + getTel(): String                            |
| + setTel(tel: String): void                   |
| + getAddress(): String                        |
| + setAddress(address: String): void           |
| + toString(): String                          |
| + isValidId(id: int): boolean                 |
| + isValidName(name: String): boolean          |
| + isLeapYear(year: int): boolean              |
| + isValidDob(date: String): boolean           |
| + isValidTel(tel: String): boolean            |
| + isValidEmail(s: String): boolean            |
| + isValidAddress(address: String): boolean    |
------------------------------------------------

 Domain constrains table

 --------------------------------------------------------------------------
| Class |  Attribute  |  type   |  mutable | optional | length | min | max |
|--------------------------------------------------------------------------|
| Person| id          | Integer |   False  |   False  |        |  1  |     |
|       | name        |  String |   False  |   False  |   50   |     |     |
|       | dateOfBirth |  String |   False  |   False  |   10   |     |     |
|       | email       |  String |   True   |   True   |   50   |     |     |
|       | tel         |  String |   True   |   True   |   12   |     |     |
|       | address     |  String |   True   |   True   |   100  |     |     |
---------------------------------------------------------------------------

 */



public class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;

    public Person(int id,String name, String dateOfBirth) {
        if(!isValidId(id)){
            throw new IllegalArgumentException("Invalid ID");
        }
        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid name");
        }
        if(!isValidDob(dateOfBirth)){
            throw new IllegalArgumentException("Invalid date of birth");
        }

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    };

    public Person(int id, String name, String dateOfBirth, String email, String tel, String address) {
        if(!isValidId(id)){
            throw new IllegalArgumentException("Invalid ID");
        }
        if(!isValidName(name)){
            throw new IllegalArgumentException("Invalid name");
        }
        if(!isValidDob(dateOfBirth)){
            throw new IllegalArgumentException("Invalid date of birth");
        }
        if(!isValidEmail(email)){
            throw new IllegalArgumentException("Invalid email");
        }
        if(!isValidTel(tel)){
            throw new IllegalArgumentException("Invalid tel");
        }
        if(!isValidAddress(address)){
            throw new IllegalArgumentException("Invalid address");
        }

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.tel = tel;
        this.address = address;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if(isValidId(id)) {
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Id must be positive");
        }
    }

    public String getName () {
        return this.name;
    }
    public void setName(String name) {
        if(isValidName(name)){
            this.name = name;
        }

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if(isValidDob(dateOfBirth)){
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isValidEmail(email)){
            this.email = email;
        }
        else{
            throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if(isValidTel(tel)){
            this.tel = tel;
        }
        else{
            throw new IllegalArgumentException("Tel must contains 10 digits");
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String s) {
        if(isValidAddress(s)){
            this.address = s;
        }
        else{
            throw new IllegalArgumentException("Address can not be null!");
        }

    }


    public static boolean isValidId(int id){
        return id > 0;
    }
    public static boolean isValidName (String name){
        return name != null && name.length() <= 50 && name.matches("^[a-zA-Z]+$") ;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDob(String date) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}";
        if(date.matches(regex)){

            int day = Integer.parseInt(date.substring(0,2));
            int month = Integer.parseInt(date.substring(3,5));
            int year = Integer.parseInt(date.substring(6,10));


            //check leap year
            int dayOfFeb;
            if(isLeapYear(year)){
                dayOfFeb = 29;
            }
            else{
                dayOfFeb = 28;
            }

            //check day
            switch (month){
                case 1,3,5,7,8,10,12:
                    return day <= 31;
                case 4,6,9,11:
                    return day <= 30;
                case 2:
                    return day <= dayOfFeb;
                default:
                    return false;
            }

        }
        else{
              return false;
        }
    }

    /**
     * Validate a Vietnam phone number
     * @param tel
     * (?:\+84|84|0)?: +84 or 84 or 0
     * (?:3|5|6|7|8|9)?: popular mobile phone operator
     * (?!0{8}): check the last 8 digits different with 00000000
     * [0-9]{8}$: check the last 8 digits
     * @return valid tel
     */

    public static boolean isValidTel(String tel) {
        return tel !=null && tel.length() <= 12 && tel.matches("^(?:\\+84|84|0)?(?:3|5|6|7|8|9)+(?!0{8})[0-9]{8}$");
    }


    /**
     * Validate a email address
     * @param email
     * - ^[a-zA-Z0-9.\-_%+]+: username
     * - @[a-zA-Z]+(\.[a-zA-Z]+)*\.[a-zA-Z]{2,}$: domain name
     * - (\.[a-zA-Z]+)*: accept zero or many subdomain
     * - [a-zA-Z]{2,}$: accept greater than or equal to 2 words (eg: vn,com)
     * @return True if the email address is valid, false otherwise
     */

    public static boolean isValidEmail (String email) {
        return email != null && email.length() <= 50 && email.matches("^[a-zA-Z0-9.\\-_%+]+@[a-zA-Z]+(\\.[a-zA-Z]+)*\\.[a-zA-Z]{2,}$");
    }
    public static boolean isValidAddress(String address){
        return address != null && address.length() <= 50 && !address.matches(".*\\W.*");
    }





    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
