package tut5;

public class Staff extends Person {
    String school;
    double pay;
    public Staff(String name,String address,String school,double pay) throws Exception {
        this.setName(name);
        this.setAddress(address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    public void setSchool(String s) {
        this.school = school;
    }
    public void setPay(double p) {
        this.pay = p;
    }
    @Override
    public String toString() {
        return "Staff[Person[name="+ this.getName() +",address="+this.getAddress()+"],school="+this.school+",pay="+this.pay+"]";
    }

}
