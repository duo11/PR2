package TUT2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class act3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("testdata");
        Scanner sc = new Scanner(f);
        int line = 0;
        double totalScore = 0;
        while (sc.hasNext()){
            if(line == 0){
                System.out.println(sc.nextLine());
                line++;
            }
            else{
                totalScore += sc.nextInt();
            }

        }
        System.out.println(totalScore/3);

    }
}
