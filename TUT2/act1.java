package TUT2;
import java.lang.Math;
public class act1 {

    public static void roll2dice (){
        int dice1 = (int) (Math.random()*6) + 1;
        System.out.println("The first dice comes up with "+dice1);
        int dice2 = (int) (Math.random()*6) + 1;
        System.out.println("The second dice comes up with "+dice2);
        System.out.println("Your total roll is "+ (dice1+dice2));
    }
    public static void main(String[] args) {
        roll2dice();
    }
}
