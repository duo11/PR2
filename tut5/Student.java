package tut5;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student() {};
    public Student(String name,String address,String program,int year,double fee) throws Exception {
        this.setName(name);
        this.setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String s) throws Exception {
        if(isProgram(s)){
            this.program = program;
        }
        else{
            throw new Exception("Wrong program format");
        }
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double setFee() {
        return fee;
    }
    public void setFee(double f){
        this.fee = f;
    }
    public boolean isProgram(String s) {
        return s.matches("[a-zA-Z]+");
    }
    @Override
    public String toString() {
        return "Student[Person[name=" + this.getName() + ",address= "+this.getAddress()+"],program="+this.program+",year="+this.year+",fee="+this.fee+"]";
    }



}
