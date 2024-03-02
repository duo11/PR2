package tut4;

public class LargeNumber {
    private String number ;

    public LargeNumber () {}
    public LargeNumber (String number) throws Exception {
         if(isValidNumber(number)){
            this.number = number;
        }
        else{
            throw new Exception("Wrong format number");
        }
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) throws Exception {
        if(isValidNumber(number)){
           this.number = number;
            System.out.println("Set number successfully");
        }
        else{
            throw new Exception("Wrong format number");
        }
    }

    public boolean isLargeNumber (String number) throws Exception {
        if ( !isValidNumber(number) ) {
            throw new Exception("Wrong format number");
        }
        else{
            if(number.length() >= 15) {
                System.out.println( number + " is a large number");
                return true;
            }
            else{
                System.out.println( number + "is not a large number");
                return false;
            }
        }
    }

    public LargeNumber add(LargeNumber number) throws Exception {
        return new LargeNumber(this.number + number.getNumber()) ;
    }

    public LargeNumber sub(LargeNumber n) throws Exception {
        // Convert both numbers to BigInteger for arithmetic operation
        return new LargeNumber(new java.math.BigInteger(this.number).subtract(new java.math.BigInteger(n.getNumber())).toString());
    }

    public LargeNumber times(LargeNumber n) throws Exception {
        return new LargeNumber(new java.math.BigInteger(this.number).multiply(new java.math.BigInteger(n.getNumber())).toString());
    }
    public LargeNumber div(LargeNumber n) throws Exception {
        return new LargeNumber(new java.math.BigInteger(this.number).divide(new java.math.BigInteger(n.getNumber())).toString());
    }


    public boolean isValidNumber(String n) {
        return (n.matches("[0-9]+"));
    }

    public static void main(String[] args) throws Exception {
        LargeNumber defaultNum = new LargeNumber();
        System.out.println(defaultNum.getNumber());
        LargeNumber n = new LargeNumber("567567567567567");
        LargeNumber m = new LargeNumber("12345");

        System.out.println(n.add(m).getNumber());//56756756756756712345
        System.out.println(n.sub(m).getNumber());//567567567555222
        System.out.println(n.times(m).getNumber());//7006621621621614615
        System.out.println(n.div(m).getNumber());//45975501625

    }

}
