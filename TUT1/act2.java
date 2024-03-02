package TUT1;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        boolean condition = true;
        while (condition){
            System.out.println("What's your name:");
            str = sc.nextLine();
            boolean change = false;
            for(int i = 0; i < str.length();i++){
                if(!Character.isAlphabetic(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
                    change = true;
                }

            }
            if(change == true) {
                condition = true;
                System.out.println("wrong format");
            }
            else condition = false ;
        }
        System.out.println("Hello, " + str + " , nice to meet you!");

    }
}
