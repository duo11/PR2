package TUT1;
import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int gross = n / 144;
            n =  n % 144;
            int dozen = n / 12;
            n = n % 12;
            System.out.println("Your number of eggs is "+ gross +" gross, "+ dozen +" dozen, and "+ n + " left over");


        }catch (Exception e){
            System.out.println("please type in some number");
        }

    }
}
