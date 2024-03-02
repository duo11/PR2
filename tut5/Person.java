package tut5;

public class Person {
    private String name;
    private String address;

    public Person () {};
    public Person (String name,String address) {
        this.name = name;
        this.address = address;
    }
    public String getName () {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String s) throws Exception {
        if(isAddress(s)){
            this.address = s;
        }
        else{
            throw new Exception("Wrong address format(abc@gmail.com)");
        }

    }
    public String toString() {

        return "Person[name=" + this.name +",address="+this.address+"]";
    }

    public boolean isAddress (String s) {
        return s.contains("@gmail.com");
    }

}
