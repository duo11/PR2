import java.time.LocalDate;
public class Test {
    public static void main(String[] args) {
        String s = "hello ";
        System.out.println(s.replaceAll("[^a-zA-Z]","") + "hello");
    }
}
